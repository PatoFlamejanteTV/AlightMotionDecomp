package androidx.leanback.util;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class StateMachine {
    static final boolean DEBUG = false;
    public static final int STATUS_INVOKED = 1;
    public static final int STATUS_ZERO = 0;
    static final String TAG = "StateMachine";
    final ArrayList<State> mStates = new ArrayList<>();
    final ArrayList<State> mFinishedStates = new ArrayList<>();
    final ArrayList<State> mUnfinishedStates = new ArrayList<>();

    /* loaded from: classes3.dex */
    public static class Condition {
        final String mName;

        public Condition(String str) {
            this.mName = str;
        }

        public boolean canProceed() {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static class Event {
        final String mName;

        public Event(String str) {
            this.mName = str;
        }
    }

    /* loaded from: classes3.dex */
    public static class State {
        final boolean mBranchEnd;
        final boolean mBranchStart;
        ArrayList<Transition> mIncomings;
        int mInvokedOutTransitions;
        final String mName;
        ArrayList<Transition> mOutgoings;
        int mStatus;

        public State(String str) {
            this(str, false, true);
        }

        void addIncoming(Transition transition) {
            if (this.mIncomings == null) {
                this.mIncomings = new ArrayList<>();
            }
            this.mIncomings.add(transition);
        }

        void addOutgoing(Transition transition) {
            if (this.mOutgoings == null) {
                this.mOutgoings = new ArrayList<>();
            }
            this.mOutgoings.add(transition);
        }

        final boolean checkPreCondition() {
            ArrayList<Transition> arrayList = this.mIncomings;
            if (arrayList == null) {
                return true;
            }
            if (this.mBranchEnd) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().mState != 1) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<Transition> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().mState == 1) {
                    return true;
                }
            }
            return false;
        }

        public final int getStatus() {
            return this.mStatus;
        }

        public void run() {
        }

        final boolean runIfNeeded() {
            if (this.mStatus != 1 && checkPreCondition()) {
                this.mStatus = 1;
                run();
                signalAutoTransitionsAfterRun();
                return true;
            }
            return false;
        }

        final void signalAutoTransitionsAfterRun() {
            Condition condition;
            ArrayList<Transition> arrayList = this.mOutgoings;
            if (arrayList != null) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    Transition next = it.next();
                    if (next.mEvent == null && ((condition = next.mCondition) == null || condition.canProceed())) {
                        this.mInvokedOutTransitions++;
                        next.mState = 1;
                        if (!this.mBranchStart) {
                            return;
                        }
                    }
                }
            }
        }

        public String toString() {
            return "[" + this.mName + " " + this.mStatus + "]";
        }

        public State(String str, boolean z8, boolean z9) {
            this.mStatus = 0;
            this.mInvokedOutTransitions = 0;
            this.mName = str;
            this.mBranchStart = z8;
            this.mBranchEnd = z9;
        }
    }

    public void addState(State state) {
        if (!this.mStates.contains(state)) {
            this.mStates.add(state);
        }
    }

    public void addTransition(State state, State state2, Event event) {
        Transition transition = new Transition(state, state2, event);
        state2.addIncoming(transition);
        state.addOutgoing(transition);
    }

    public void fireEvent(Event event) {
        for (int i8 = 0; i8 < this.mFinishedStates.size(); i8++) {
            State state = this.mFinishedStates.get(i8);
            ArrayList<Transition> arrayList = state.mOutgoings;
            if (arrayList != null && (state.mBranchStart || state.mInvokedOutTransitions <= 0)) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    Transition next = it.next();
                    if (next.mState != 1 && next.mEvent == event) {
                        next.mState = 1;
                        state.mInvokedOutTransitions++;
                        if (!state.mBranchStart) {
                            break;
                        }
                    }
                }
            }
        }
        runUnfinishedStates();
    }

    public void reset() {
        this.mUnfinishedStates.clear();
        this.mFinishedStates.clear();
        Iterator<State> it = this.mStates.iterator();
        while (it.hasNext()) {
            State next = it.next();
            next.mStatus = 0;
            next.mInvokedOutTransitions = 0;
            ArrayList<Transition> arrayList = next.mOutgoings;
            if (arrayList != null) {
                Iterator<Transition> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().mState = 0;
                }
            }
        }
    }

    void runUnfinishedStates() {
        boolean z8;
        do {
            z8 = false;
            for (int size = this.mUnfinishedStates.size() - 1; size >= 0; size--) {
                State state = this.mUnfinishedStates.get(size);
                if (state.runIfNeeded()) {
                    this.mUnfinishedStates.remove(size);
                    this.mFinishedStates.add(state);
                    z8 = true;
                }
            }
        } while (z8);
    }

    public void start() {
        this.mUnfinishedStates.addAll(this.mStates);
        runUnfinishedStates();
    }

    public void addTransition(State state, State state2, Condition condition) {
        Transition transition = new Transition(state, state2, condition);
        state2.addIncoming(transition);
        state.addOutgoing(transition);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Transition {
        final Condition mCondition;
        final Event mEvent;
        final State mFromState;
        int mState;
        final State mToState;

        Transition(State state, State state2, Event event) {
            this.mState = 0;
            if (event != null) {
                this.mFromState = state;
                this.mToState = state2;
                this.mEvent = event;
                this.mCondition = null;
                return;
            }
            throw new IllegalArgumentException();
        }

        public String toString() {
            String str;
            Event event = this.mEvent;
            if (event != null) {
                str = event.mName;
            } else {
                Condition condition = this.mCondition;
                if (condition != null) {
                    str = condition.mName;
                } else {
                    str = "auto";
                }
            }
            return "[" + this.mFromState.mName + " -> " + this.mToState.mName + " <" + str + ">]";
        }

        Transition(State state, State state2) {
            this.mState = 0;
            this.mFromState = state;
            this.mToState = state2;
            this.mEvent = null;
            this.mCondition = null;
        }

        Transition(State state, State state2, Condition condition) {
            this.mState = 0;
            if (condition != null) {
                this.mFromState = state;
                this.mToState = state2;
                this.mEvent = null;
                this.mCondition = condition;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public void addTransition(State state, State state2) {
        Transition transition = new Transition(state, state2);
        state2.addIncoming(transition);
        state.addOutgoing(transition);
    }
}

package androidx.work.impl.model;

import Q5.I;
import Q5.p;
import a6.AbstractC1677b;
import android.net.Uri;
import android.os.Build;
import androidx.room.TypeConverter;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class WorkTypeConverters {
    public static final WorkTypeConverters INSTANCE = new WorkTypeConverters();

    /* loaded from: classes3.dex */
    private static final class BackoffPolicyIds {
        public static final int EXPONENTIAL = 0;
        public static final BackoffPolicyIds INSTANCE = new BackoffPolicyIds();
        public static final int LINEAR = 1;

        private BackoffPolicyIds() {
        }
    }

    /* loaded from: classes3.dex */
    private static final class NetworkTypeIds {
        public static final int CONNECTED = 1;
        public static final NetworkTypeIds INSTANCE = new NetworkTypeIds();
        public static final int METERED = 4;
        public static final int NOT_REQUIRED = 0;
        public static final int NOT_ROAMING = 3;
        public static final int TEMPORARILY_UNMETERED = 5;
        public static final int UNMETERED = 2;

        private NetworkTypeIds() {
        }
    }

    /* loaded from: classes3.dex */
    private static final class OutOfPolicyIds {
        public static final int DROP_WORK_REQUEST = 1;
        public static final OutOfPolicyIds INSTANCE = new OutOfPolicyIds();
        public static final int RUN_AS_NON_EXPEDITED_WORK_REQUEST = 0;

        private OutOfPolicyIds() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        public static final String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        public static final StateIds INSTANCE = new StateIds();
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;

        private StateIds() {
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NetworkType.values().length];
            try {
                iArr3[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private WorkTypeConverters() {
    }

    @TypeConverter
    public static final int backoffPolicyToInt(BackoffPolicy backoffPolicy) {
        AbstractC3292y.i(backoffPolicy, "backoffPolicy");
        int i8 = WhenMappings.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return 1;
            }
            throw new p();
        }
        return 0;
    }

    @TypeConverter
    public static final Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers(byte[] bytes) {
        AbstractC3292y.i(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i8 = 0; i8 < readInt; i8++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        AbstractC3292y.h(uri, "uri");
                        linkedHashSet.add(new Constraints.ContentUriTrigger(uri, readBoolean));
                    }
                    I i9 = I.f8786a;
                    AbstractC1677b.a(objectInputStream, null);
                } finally {
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
            I i10 = I.f8786a;
            AbstractC1677b.a(byteArrayInputStream, null);
            return linkedHashSet;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1677b.a(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    @TypeConverter
    public static final BackoffPolicy intToBackoffPolicy(int i8) {
        if (i8 != 0) {
            if (i8 == 1) {
                return BackoffPolicy.LINEAR;
            }
            throw new IllegalArgumentException("Could not convert " + i8 + " to BackoffPolicy");
        }
        return BackoffPolicy.EXPONENTIAL;
    }

    @TypeConverter
    public static final NetworkType intToNetworkType(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i8 == 5) {
                                return NetworkType.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i8 + " to NetworkType");
                        }
                        return NetworkType.METERED;
                    }
                    return NetworkType.NOT_ROAMING;
                }
                return NetworkType.UNMETERED;
            }
            return NetworkType.CONNECTED;
        }
        return NetworkType.NOT_REQUIRED;
    }

    @TypeConverter
    public static final OutOfQuotaPolicy intToOutOfQuotaPolicy(int i8) {
        if (i8 != 0) {
            if (i8 == 1) {
                return OutOfQuotaPolicy.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException("Could not convert " + i8 + " to OutOfQuotaPolicy");
        }
        return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    @TypeConverter
    public static final WorkInfo.State intToState(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 == 5) {
                                return WorkInfo.State.CANCELLED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i8 + " to State");
                        }
                        return WorkInfo.State.BLOCKED;
                    }
                    return WorkInfo.State.FAILED;
                }
                return WorkInfo.State.SUCCEEDED;
            }
            return WorkInfo.State.RUNNING;
        }
        return WorkInfo.State.ENQUEUED;
    }

    @TypeConverter
    public static final int networkTypeToInt(NetworkType networkType) {
        AbstractC3292y.i(networkType, "networkType");
        int i8 = WhenMappings.$EnumSwitchMapping$2[networkType.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return 1;
            }
            if (i8 != 3) {
                if (i8 == 4) {
                    return 3;
                }
                if (i8 != 5) {
                    if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
                        return 5;
                    }
                    throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                }
                return 4;
            }
            return 2;
        }
        return 0;
    }

    @TypeConverter
    public static final int outOfQuotaPolicyToInt(OutOfQuotaPolicy policy) {
        AbstractC3292y.i(policy, "policy");
        int i8 = WhenMappings.$EnumSwitchMapping$3[policy.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return 1;
            }
            throw new p();
        }
        return 0;
    }

    @TypeConverter
    public static final byte[] setOfTriggersToByteArray(Set<Constraints.ContentUriTrigger> triggers) {
        AbstractC3292y.i(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (Constraints.ContentUriTrigger contentUriTrigger : triggers) {
                    objectOutputStream.writeUTF(contentUriTrigger.getUri().toString());
                    objectOutputStream.writeBoolean(contentUriTrigger.isTriggeredForDescendants());
                }
                I i8 = I.f8786a;
                AbstractC1677b.a(objectOutputStream, null);
                AbstractC1677b.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                AbstractC3292y.h(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1677b.a(byteArrayOutputStream, th);
                throw th2;
            }
        }
    }

    @TypeConverter
    public static final int stateToInt(WorkInfo.State state) {
        AbstractC3292y.i(state, "state");
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new p();
        }
    }
}

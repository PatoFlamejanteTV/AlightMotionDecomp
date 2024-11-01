package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final Context mAppContext;
    private final Handler mHandler;
    private final HashMap<BroadcastReceiver, ArrayList<ReceiverRecord>> mReceivers = new HashMap<>();
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions = new HashMap<>();
    private final ArrayList<BroadcastRecord> mPendingBroadcasts = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class BroadcastRecord {
        final Intent intent;
        final ArrayList<ReceiverRecord> receivers;

        BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.intent = intent;
            this.receivers = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class ReceiverRecord {
        boolean broadcasting;
        boolean dead;
        final IntentFilter filter;
        final BroadcastReceiver receiver;

        ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.filter = intentFilter;
            this.receiver = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.receiver);
            sb.append(" filter=");
            sb.append(this.filter);
            if (this.dead) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new Handler(context.getMainLooper()) { // from class: androidx.localbroadcastmanager.content.LocalBroadcastManager.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    LocalBroadcastManager.this.executePendingBroadcasts();
                }
            }
        };
    }

    @NonNull
    public static LocalBroadcastManager getInstance(@NonNull Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            try {
                if (mInstance == null) {
                    mInstance = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = mInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return localBroadcastManager;
    }

    void executePendingBroadcasts() {
        int size;
        BroadcastRecord[] broadcastRecordArr;
        while (true) {
            synchronized (this.mReceivers) {
                try {
                    size = this.mPendingBroadcasts.size();
                    if (size <= 0) {
                        return;
                    }
                    broadcastRecordArr = new BroadcastRecord[size];
                    this.mPendingBroadcasts.toArray(broadcastRecordArr);
                    this.mPendingBroadcasts.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i8 = 0; i8 < size; i8++) {
                BroadcastRecord broadcastRecord = broadcastRecordArr[i8];
                int size2 = broadcastRecord.receivers.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    ReceiverRecord receiverRecord = broadcastRecord.receivers.get(i9);
                    if (!receiverRecord.dead) {
                        receiverRecord.receiver.onReceive(this.mAppContext, broadcastRecord.intent);
                    }
                }
            }
        }
    }

    public void registerReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            try {
                ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
                ArrayList<ReceiverRecord> arrayList = this.mReceivers.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.mReceivers.put(broadcastReceiver, arrayList);
                }
                arrayList.add(receiverRecord);
                for (int i8 = 0; i8 < intentFilter.countActions(); i8++) {
                    String action = intentFilter.getAction(i8);
                    ArrayList<ReceiverRecord> arrayList2 = this.mActions.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.mActions.put(action, arrayList2);
                    }
                    arrayList2.add(receiverRecord);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean sendBroadcast(@NonNull Intent intent) {
        boolean z8;
        int i8;
        String str;
        ArrayList arrayList;
        ArrayList<ReceiverRecord> arrayList2;
        String str2;
        String str3;
        synchronized (this.mReceivers) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                if ((intent.getFlags() & 8) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    Log.v(TAG, "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<ReceiverRecord> arrayList3 = this.mActions.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z8) {
                        Log.v(TAG, "Action list: " + arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i9 = 0;
                    while (i9 < arrayList3.size()) {
                        ReceiverRecord receiverRecord = arrayList3.get(i9);
                        if (z8) {
                            Log.v(TAG, "Matching against filter " + receiverRecord.filter);
                        }
                        if (receiverRecord.broadcasting) {
                            if (z8) {
                                Log.v(TAG, "  Filter's target already added");
                            }
                            i8 = i9;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = resolveTypeIfNeeded;
                            arrayList = arrayList4;
                        } else {
                            i8 = i9;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = resolveTypeIfNeeded;
                            int match = receiverRecord.filter.match(action, resolveTypeIfNeeded, scheme, data, categories, TAG);
                            if (match >= 0) {
                                if (z8) {
                                    Log.v(TAG, "  Filter matched!  match=0x" + Integer.toHexString(match));
                                }
                                if (arrayList == null) {
                                    arrayList4 = new ArrayList();
                                } else {
                                    arrayList4 = arrayList;
                                }
                                arrayList4.add(receiverRecord);
                                receiverRecord.broadcasting = true;
                                i9 = i8 + 1;
                                action = str;
                                arrayList3 = arrayList2;
                                resolveTypeIfNeeded = str2;
                            } else if (z8) {
                                if (match != -4) {
                                    if (match != -3) {
                                        if (match != -2) {
                                            if (match != -1) {
                                                str3 = "unknown reason";
                                            } else {
                                                str3 = "type";
                                            }
                                        } else {
                                            str3 = DataSchemeDataSource.SCHEME_DATA;
                                        }
                                    } else {
                                        str3 = "action";
                                    }
                                } else {
                                    str3 = "category";
                                }
                                Log.v(TAG, "  Filter did not match: " + str3);
                            }
                        }
                        arrayList4 = arrayList;
                        i9 = i8 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        resolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        for (int i10 = 0; i10 < arrayList5.size(); i10++) {
                            ((ReceiverRecord) arrayList5.get(i10)).broadcasting = false;
                        }
                        this.mPendingBroadcasts.add(new BroadcastRecord(intent, arrayList5));
                        if (!this.mHandler.hasMessages(1)) {
                            this.mHandler.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sendBroadcastSync(@NonNull Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    public void unregisterReceiver(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            try {
                ArrayList<ReceiverRecord> remove = this.mReceivers.remove(broadcastReceiver);
                if (remove == null) {
                    return;
                }
                for (int size = remove.size() - 1; size >= 0; size--) {
                    ReceiverRecord receiverRecord = remove.get(size);
                    receiverRecord.dead = true;
                    for (int i8 = 0; i8 < receiverRecord.filter.countActions(); i8++) {
                        String action = receiverRecord.filter.getAction(i8);
                        ArrayList<ReceiverRecord> arrayList = this.mActions.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                ReceiverRecord receiverRecord2 = arrayList.get(size2);
                                if (receiverRecord2.receiver == broadcastReceiver) {
                                    receiverRecord2.dead = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.mActions.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

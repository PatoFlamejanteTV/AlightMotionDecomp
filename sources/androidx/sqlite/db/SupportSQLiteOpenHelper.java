package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteCompat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes3.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    /* loaded from: classes3.dex */
    public static abstract class Callback {
        public static final Companion Companion = new Companion(null);
        private static final String TAG = "SupportSQLite";
        public final int version;

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public Callback(int i8) {
            this.version = i8;
        }

        private final void deleteDatabaseFile(String str) {
            int i8;
            boolean z8;
            if (!n.s(str, ":memory:", true)) {
                int length = str.length() - 1;
                int i9 = 0;
                boolean z9 = false;
                while (i9 <= length) {
                    if (!z9) {
                        i8 = i9;
                    } else {
                        i8 = length;
                    }
                    if (AbstractC3292y.k(str.charAt(i8), 32) <= 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z9) {
                        if (!z8) {
                            z9 = true;
                        } else {
                            i9++;
                        }
                    } else if (!z8) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i9, length + 1).toString().length() != 0) {
                    Log.w(TAG, "deleting the database file: " + str);
                    try {
                        SupportSQLiteCompat.Api16Impl.deleteDatabase(new File(str));
                    } catch (Exception e8) {
                        Log.w(TAG, "delete failed: ", e8);
                    }
                }
            }
        }

        public void onConfigure(SupportSQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
        }

        public void onCorruption(SupportSQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
            Log.e(TAG, "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String path = db.getPath();
                if (path != null) {
                    deleteDatabaseFile(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = db.getAttachedDbs();
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            AbstractC3292y.h(obj, "p.second");
                            deleteDatabaseFile((String) obj);
                        }
                    } else {
                        String path2 = db.getPath();
                        if (path2 != null) {
                            deleteDatabaseFile(path2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onDowngrade(SupportSQLiteDatabase db, int i8, int i9) {
            AbstractC3292y.i(db, "db");
            throw new SQLiteException("Can't downgrade database from version " + i8 + " to " + i9);
        }

        public void onOpen(SupportSQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
        }

        public abstract void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i8, int i9);
    }

    /* loaded from: classes3.dex */
    public interface Factory {
        SupportSQLiteOpenHelper create(Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    SupportSQLiteDatabase getReadableDatabase();

    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean z8);

    /* loaded from: classes3.dex */
    public static final class Configuration {
        public static final Companion Companion = new Companion(null);
        public final boolean allowDataLossOnRecovery;
        public final Callback callback;
        public final Context context;
        public final String name;
        public final boolean useNoBackupDirectory;

        /* loaded from: classes3.dex */
        public static class Builder {
            private boolean allowDataLossOnRecovery;
            private Callback callback;
            private final Context context;
            private String name;
            private boolean useNoBackupDirectory;

            public Builder(Context context) {
                AbstractC3292y.i(context, "context");
                this.context = context;
            }

            public Builder allowDataLossOnRecovery(boolean z8) {
                this.allowDataLossOnRecovery = z8;
                return this;
            }

            public Configuration build() {
                String str;
                Callback callback = this.callback;
                if (callback != null) {
                    if (this.useNoBackupDirectory && ((str = this.name) == null || str.length() == 0)) {
                        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                    }
                    return new Configuration(this.context, this.name, callback, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
            }

            public Builder callback(Callback callback) {
                AbstractC3292y.i(callback, "callback");
                this.callback = callback;
                return this;
            }

            public Builder name(String str) {
                this.name = str;
                return this;
            }

            public Builder noBackupDirectory(boolean z8) {
                this.useNoBackupDirectory = z8;
                return this;
            }
        }

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public final Builder builder(Context context) {
                AbstractC3292y.i(context, "context");
                return new Builder(context);
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public Configuration(Context context, String str, Callback callback, boolean z8, boolean z9) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(callback, "callback");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z8;
            this.allowDataLossOnRecovery = z9;
        }

        public static final Builder builder(Context context) {
            return Companion.builder(context);
        }

        public /* synthetic */ Configuration(Context context, String str, Callback callback, boolean z8, boolean z9, int i8, AbstractC3284p abstractC3284p) {
            this(context, str, callback, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? false : z9);
        }
    }
}

package androidx.room;

import Q5.I;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    private static final int BLOB = 5;
    public static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;
    public static final int POOL_LIMIT = 15;
    private static final int STRING = 4;
    private int argCount;
    private final int[] bindingTypes;
    public final byte[][] blobBindings;

    @VisibleForTesting
    private final int capacity;
    public final double[] doubleBindings;
    public final long[] longBindings;
    private volatile String query;
    public final String[] stringBindings;
    public static final Companion Companion = new Companion(null);
    public static final TreeMap<Integer, RoomSQLiteQuery> queryPool = new TreeMap<>();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Binding {
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getQueryPool$annotations() {
        }

        public final RoomSQLiteQuery acquire(String query, int i8) {
            AbstractC3292y.i(query, "query");
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            synchronized (treeMap) {
                Map.Entry<Integer, RoomSQLiteQuery> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i8));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    RoomSQLiteQuery sqliteQuery = ceilingEntry.getValue();
                    sqliteQuery.init(query, i8);
                    AbstractC3292y.h(sqliteQuery, "sqliteQuery");
                    return sqliteQuery;
                }
                I i9 = I.f8786a;
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i8, null);
                roomSQLiteQuery.init(query, i8);
                return roomSQLiteQuery;
            }
        }

        public final RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
            AbstractC3292y.i(supportSQLiteQuery, "supportSQLiteQuery");
            final RoomSQLiteQuery acquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindBlob(int i8, byte[] value) {
                    AbstractC3292y.i(value, "value");
                    RoomSQLiteQuery.this.bindBlob(i8, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindDouble(int i8, double d8) {
                    RoomSQLiteQuery.this.bindDouble(i8, d8);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindLong(int i8, long j8) {
                    RoomSQLiteQuery.this.bindLong(i8, j8);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindNull(int i8) {
                    RoomSQLiteQuery.this.bindNull(i8);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindString(int i8, String value) {
                    AbstractC3292y.i(value, "value");
                    RoomSQLiteQuery.this.bindString(i8, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void clearBindings() {
                    RoomSQLiteQuery.this.clearBindings();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    RoomSQLiteQuery.this.close();
                }
            });
            return acquire;
        }

        public final void prunePoolLocked$room_runtime_release() {
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                AbstractC3292y.h(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i8 = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i8;
                    } else {
                        return;
                    }
                }
            }
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ RoomSQLiteQuery(int i8, AbstractC3284p abstractC3284p) {
        this(i8);
    }

    public static final RoomSQLiteQuery acquire(String str, int i8) {
        return Companion.acquire(str, i8);
    }

    public static final RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
        return Companion.copyFrom(supportSQLiteQuery);
    }

    private static /* synthetic */ void getBindingTypes$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLongBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getStringBindings$annotations() {
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i8, byte[] value) {
        AbstractC3292y.i(value, "value");
        this.bindingTypes[i8] = 5;
        this.blobBindings[i8] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i8, double d8) {
        this.bindingTypes[i8] = 3;
        this.doubleBindings[i8] = d8;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i8, long j8) {
        this.bindingTypes[i8] = 2;
        this.longBindings[i8] = j8;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i8) {
        this.bindingTypes[i8] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i8, String value) {
        AbstractC3292y.i(value, "value");
        this.bindingTypes[i8] = 4;
        this.stringBindings[i8] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram statement) {
        AbstractC3292y.i(statement, "statement");
        int argCount = getArgCount();
        if (1 <= argCount) {
            int i8 = 1;
            while (true) {
                int i9 = this.bindingTypes[i8];
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                if (i9 == 5) {
                                    byte[] bArr = this.blobBindings[i8];
                                    if (bArr != null) {
                                        statement.bindBlob(i8, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str = this.stringBindings[i8];
                                if (str != null) {
                                    statement.bindString(i8, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                        } else {
                            statement.bindDouble(i8, this.doubleBindings[i8]);
                        }
                    } else {
                        statement.bindLong(i8, this.longBindings[i8]);
                    }
                } else {
                    statement.bindNull(i8);
                }
                if (i8 != argCount) {
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        Arrays.fill(this.bindingTypes, 1);
        Arrays.fill(this.stringBindings, (Object) null);
        Arrays.fill(this.blobBindings, (Object) null);
        this.query = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void copyArgumentsFrom(RoomSQLiteQuery other) {
        AbstractC3292y.i(other, "other");
        int argCount = other.getArgCount() + 1;
        System.arraycopy(other.bindingTypes, 0, this.bindingTypes, 0, argCount);
        System.arraycopy(other.longBindings, 0, this.longBindings, 0, argCount);
        System.arraycopy(other.stringBindings, 0, this.stringBindings, 0, argCount);
        System.arraycopy(other.blobBindings, 0, this.blobBindings, 0, argCount);
        System.arraycopy(other.doubleBindings, 0, this.doubleBindings, 0, argCount);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.argCount;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void init(String query, int i8) {
        AbstractC3292y.i(query, "query");
        this.query = query;
        this.argCount = i8;
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            Companion.prunePoolLocked$room_runtime_release();
            I i8 = I.f8786a;
        }
    }

    private RoomSQLiteQuery(int i8) {
        this.capacity = i8;
        int i9 = i8 + 1;
        this.bindingTypes = new int[i9];
        this.longBindings = new long[i9];
        this.doubleBindings = new double[i9];
        this.stringBindings = new String[i9];
        this.blobBindings = new byte[i9];
    }
}

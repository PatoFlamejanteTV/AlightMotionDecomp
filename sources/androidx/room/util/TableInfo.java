package androidx.room.util;

import R5.a0;
import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.ColumnInfo;
import androidx.room.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class TableInfo {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;
    public static final Companion Companion = new Companion(null);
    public final Map<String, Column> columns;
    public final Set<ForeignKey> foreignKeys;
    public final Set<Index> indices;
    public final String name;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final TableInfo read(SupportSQLiteDatabase database, String tableName) {
            AbstractC3292y.i(database, "database");
            AbstractC3292y.i(tableName, "tableName");
            return TableInfoKt.readTableInfo(database, tableName);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CreatedFrom {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes3.dex */
    public static final class ForeignKey {
        public final List<String> columnNames;
        public final String onDelete;
        public final String onUpdate;
        public final List<String> referenceColumnNames;
        public final String referenceTable;

        public ForeignKey(String referenceTable, String onDelete, String onUpdate, List<String> columnNames, List<String> referenceColumnNames) {
            AbstractC3292y.i(referenceTable, "referenceTable");
            AbstractC3292y.i(onDelete, "onDelete");
            AbstractC3292y.i(onUpdate, "onUpdate");
            AbstractC3292y.i(columnNames, "columnNames");
            AbstractC3292y.i(referenceColumnNames, "referenceColumnNames");
            this.referenceTable = referenceTable;
            this.onDelete = onDelete;
            this.onUpdate = onUpdate;
            this.columnNames = columnNames;
            this.referenceColumnNames = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForeignKey)) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) obj;
            if (!AbstractC3292y.d(this.referenceTable, foreignKey.referenceTable) || !AbstractC3292y.d(this.onDelete, foreignKey.onDelete) || !AbstractC3292y.d(this.onUpdate, foreignKey.onUpdate) || !AbstractC3292y.d(this.columnNames, foreignKey.columnNames)) {
                return false;
            }
            return AbstractC3292y.d(this.referenceColumnNames, foreignKey.referenceColumnNames);
        }

        public int hashCode() {
            return (((((((this.referenceTable.hashCode() * 31) + this.onDelete.hashCode()) * 31) + this.onUpdate.hashCode()) * 31) + this.columnNames.hashCode()) * 31) + this.referenceColumnNames.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + " +', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {
        private final String from;
        private final int id;
        private final int sequence;
        private final String to;

        public ForeignKeyWithSequence(int i8, int i9, String from, String to) {
            AbstractC3292y.i(from, "from");
            AbstractC3292y.i(to, "to");
            this.id = i8;
            this.sequence = i9;
            this.from = from;
            this.to = to;
        }

        public final String getFrom() {
            return this.from;
        }

        public final int getId() {
            return this.id;
        }

        public final int getSequence() {
            return this.sequence;
        }

        public final String getTo() {
            return this.to;
        }

        @Override // java.lang.Comparable
        public int compareTo(ForeignKeyWithSequence other) {
            AbstractC3292y.i(other, "other");
            int i8 = this.id - other.id;
            return i8 == 0 ? this.sequence - other.sequence : i8;
        }
    }

    public TableInfo(String name, Map<String, Column> columns, Set<ForeignKey> foreignKeys, Set<Index> set) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(columns, "columns");
        AbstractC3292y.i(foreignKeys, "foreignKeys");
        this.name = name;
        this.columns = columns;
        this.foreignKeys = foreignKeys;
        this.indices = set;
    }

    public static final TableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(Object obj) {
        Set<Index> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        if (!AbstractC3292y.d(this.name, tableInfo.name) || !AbstractC3292y.d(this.columns, tableInfo.columns) || !AbstractC3292y.d(this.foreignKeys, tableInfo.foreignKeys)) {
            return false;
        }
        Set<Index> set2 = this.indices;
        if (set2 == null || (set = tableInfo.indices) == null) {
            return true;
        }
        return AbstractC3292y.d(set2, set);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.foreignKeys.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }

    public /* synthetic */ TableInfo(String str, Map map, Set set, Set set2, int i8, AbstractC3284p abstractC3284p) {
        this(str, map, set, (i8 & 8) != 0 ? null : set2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TableInfo(String name, Map<String, Column> columns, Set<ForeignKey> foreignKeys) {
        this(name, columns, foreignKeys, a0.f());
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(columns, "columns");
        AbstractC3292y.i(foreignKeys, "foreignKeys");
    }

    /* loaded from: classes3.dex */
    public static final class Column {
        public static final Companion Companion = new Companion(null);
        public final int affinity;
        public final int createdFrom;
        public final String defaultValue;
        public final String name;
        public final boolean notNull;
        public final int primaryKeyPosition;
        public final String type;

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            private final boolean containsSurroundingParenthesis(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (i8 < str.length()) {
                    char charAt = str.charAt(i8);
                    int i11 = i10 + 1;
                    if (i10 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i9++;
                    } else if (charAt == ')' && i9 - 1 == 0 && i10 != str.length() - 1) {
                        return false;
                    }
                    i8++;
                    i10 = i11;
                }
                if (i9 != 0) {
                    return false;
                }
                return true;
            }

            @SuppressLint({"SyntheticAccessor"})
            @VisibleForTesting
            public final boolean defaultValueEquals(String current, String str) {
                AbstractC3292y.i(current, "current");
                if (AbstractC3292y.d(current, str)) {
                    return true;
                }
                if (containsSurroundingParenthesis(current)) {
                    String substring = current.substring(1, current.length() - 1);
                    AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return AbstractC3292y.d(n.M0(substring).toString(), str);
                }
                return false;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public Column(String name, String type, boolean z8, int i8, String str, int i9) {
            AbstractC3292y.i(name, "name");
            AbstractC3292y.i(type, "type");
            this.name = name;
            this.type = type;
            this.notNull = z8;
            this.primaryKeyPosition = i8;
            this.defaultValue = str;
            this.createdFrom = i9;
            this.affinity = findAffinity(type);
        }

        @SuppressLint({"SyntheticAccessor"})
        @VisibleForTesting
        public static final boolean defaultValueEquals(String str, String str2) {
            return Companion.defaultValueEquals(str, str2);
        }

        @ColumnInfo.SQLiteTypeAffinity
        private final int findAffinity(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            AbstractC3292y.h(US, "US");
            String upperCase = str.toUpperCase(US);
            AbstractC3292y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (n.G(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (n.G(upperCase, "CHAR", false, 2, null) || n.G(upperCase, "CLOB", false, 2, null) || n.G(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (n.G(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            if (!n.G(upperCase, "REAL", false, 2, null) && !n.G(upperCase, "FLOA", false, 2, null) && !n.G(upperCase, "DOUB", false, 2, null)) {
                return 1;
            }
            return 4;
        }

        @ColumnInfo.SQLiteTypeAffinity
        public static /* synthetic */ void getAffinity$annotations() {
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Column) || this.primaryKeyPosition != ((Column) obj).primaryKeyPosition) {
                return false;
            }
            Column column = (Column) obj;
            if (!AbstractC3292y.d(this.name, column.name) || this.notNull != column.notNull) {
                return false;
            }
            if (this.createdFrom == 1 && column.createdFrom == 2 && (str3 = this.defaultValue) != null && !Companion.defaultValueEquals(str3, column.defaultValue)) {
                return false;
            }
            if (this.createdFrom == 2 && column.createdFrom == 1 && (str2 = column.defaultValue) != null && !Companion.defaultValueEquals(str2, this.defaultValue)) {
                return false;
            }
            int i8 = this.createdFrom;
            if ((i8 == 0 || i8 != column.createdFrom || ((str = this.defaultValue) == null ? column.defaultValue == null : Companion.defaultValueEquals(str, column.defaultValue))) && this.affinity == column.affinity) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i8;
            int hashCode = ((this.name.hashCode() * 31) + this.affinity) * 31;
            if (this.notNull) {
                i8 = 1231;
            } else {
                i8 = 1237;
            }
            return ((hashCode + i8) * 31) + this.primaryKeyPosition;
        }

        public final boolean isPrimaryKey() {
            if (this.primaryKeyPosition > 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.name);
            sb.append("', type='");
            sb.append(this.type);
            sb.append("', affinity='");
            sb.append(this.affinity);
            sb.append("', notNull=");
            sb.append(this.notNull);
            sb.append(", primaryKeyPosition=");
            sb.append(this.primaryKeyPosition);
            sb.append(", defaultValue='");
            String str = this.defaultValue;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Column(String name, String type, boolean z8, int i8) {
            this(name, type, z8, i8, null, 0);
            AbstractC3292y.i(name, "name");
            AbstractC3292y.i(type, "type");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes3.dex */
    public static final class Index {
        public static final Companion Companion = new Companion(null);
        public static final String DEFAULT_PREFIX = "index_";
        public final List<String> columns;
        public final String name;
        public List<String> orders;
        public final boolean unique;

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public Index(String name, boolean z8, List<String> columns, List<String> orders) {
            AbstractC3292y.i(name, "name");
            AbstractC3292y.i(columns, "columns");
            AbstractC3292y.i(orders, "orders");
            this.name = name;
            this.unique = z8;
            this.columns = columns;
            this.orders = orders;
            List<String> list = orders;
            if (list.isEmpty()) {
                int size = columns.size();
                list = new ArrayList(size);
                for (int i8 = 0; i8 < size; i8++) {
                    list.add(Index.Order.ASC.name());
                }
            }
            this.orders = (List) list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Index)) {
                return false;
            }
            Index index = (Index) obj;
            if (this.unique != index.unique || !AbstractC3292y.d(this.columns, index.columns) || !AbstractC3292y.d(this.orders, index.orders)) {
                return false;
            }
            if (n.B(this.name, DEFAULT_PREFIX, false, 2, null)) {
                return n.B(index.name, DEFAULT_PREFIX, false, 2, null);
            }
            return AbstractC3292y.d(this.name, index.name);
        }

        public int hashCode() {
            int hashCode;
            if (n.B(this.name, DEFAULT_PREFIX, false, 2, null)) {
                hashCode = -1184239155;
            } else {
                hashCode = this.name.hashCode();
            }
            return (((((hashCode * 31) + (this.unique ? 1 : 0)) * 31) + this.columns.hashCode()) * 31) + this.orders.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.unique + ", columns=" + this.columns + ", orders=" + this.orders + "'}";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Index(java.lang.String r5, boolean r6, java.util.List<java.lang.String> r7) {
            /*
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.AbstractC3292y.i(r5, r0)
                java.lang.String r0 = "columns"
                kotlin.jvm.internal.AbstractC3292y.i(r7, r0)
                int r0 = r7.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
            L14:
                if (r2 >= r0) goto L22
                androidx.room.Index$Order r3 = androidx.room.Index.Order.ASC
                java.lang.String r3 = r3.name()
                r1.add(r3)
                int r2 = r2 + 1
                goto L14
            L22:
                r4.<init>(r5, r6, r7, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.Index.<init>(java.lang.String, boolean, java.util.List):void");
        }
    }
}

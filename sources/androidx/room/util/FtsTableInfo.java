package androidx.room.util;

import Q5.I;
import R5.AbstractC1435t;
import R5.a0;
import a6.AbstractC1677b;
import android.annotation.SuppressLint;
import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class FtsTableInfo {
    public static final Companion Companion = new Companion(null);
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final Set<String> columns;
    public final String name;
    public final Set<String> options;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        private final Set<String> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            Set b9 = a0.b();
            Cursor query = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
            try {
                if (query.getColumnCount() > 0) {
                    int columnIndex = query.getColumnIndex("name");
                    while (query.moveToNext()) {
                        String string = query.getString(columnIndex);
                        AbstractC3292y.h(string, "cursor.getString(nameIndex)");
                        b9.add(string);
                    }
                }
                I i8 = I.f8786a;
                AbstractC1677b.a(query, null);
                return a0.a(b9);
            } finally {
            }
        }

        private final Set<String> readOptions(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            String sql;
            Cursor query = supportSQLiteDatabase.query("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                if (query.moveToFirst()) {
                    sql = query.getString(query.getColumnIndexOrThrow("sql"));
                } else {
                    sql = "";
                }
                AbstractC1677b.a(query, null);
                AbstractC3292y.h(sql, "sql");
                return parseOptions(sql);
            } finally {
            }
        }

        @VisibleForTesting
        public final Set<String> parseOptions(String createStatement) {
            int i8;
            boolean z8;
            Character ch;
            AbstractC3292y.i(createStatement, "createStatement");
            if (createStatement.length() == 0) {
                return a0.f();
            }
            String substring = createStatement.substring(n.Q(createStatement, '(', 0, false, 6, null) + 1, n.W(createStatement, ')', 0, false, 6, null));
            AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i9 = -1;
            int i10 = 0;
            int i11 = 0;
            while (i10 < substring.length()) {
                char charAt = substring.charAt(i10);
                int i12 = i11 + 1;
                if (charAt == '\'' || charAt == '\"' || charAt == '`') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    } else {
                        Character ch2 = (Character) arrayDeque.peek();
                        if (ch2 != null && ch2.charValue() == charAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (charAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    }
                } else if (charAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (charAt == ',' && arrayDeque.isEmpty()) {
                    String substring2 = substring.substring(i9 + 1, i11);
                    AbstractC3292y.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = substring2.length() - 1;
                    int i13 = 0;
                    boolean z9 = false;
                    while (i13 <= length) {
                        if (!z9) {
                            i8 = i13;
                        } else {
                            i8 = length;
                        }
                        if (AbstractC3292y.k(substring2.charAt(i8), 32) <= 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (!z9) {
                            if (!z8) {
                                z9 = true;
                            } else {
                                i13++;
                            }
                        } else {
                            if (!z8) {
                                break;
                            }
                            length--;
                        }
                    }
                    arrayList.add(substring2.subSequence(i13, length + 1).toString());
                    i9 = i11;
                }
                i10++;
                i11 = i12;
            }
            String substring3 = substring.substring(i9 + 1);
            AbstractC3292y.h(substring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(n.M0(substring3).toString());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = (String) obj;
                String[] strArr = FtsTableInfo.FTS_OPTIONS;
                int length2 = strArr.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length2) {
                        break;
                    }
                    if (n.B(str, strArr[i14], false, 2, null)) {
                        arrayList2.add(obj);
                        break;
                    }
                    i14++;
                }
            }
            return AbstractC1435t.b1(arrayList2);
        }

        @SuppressLint({"SyntheticAccessor"})
        public final FtsTableInfo read(SupportSQLiteDatabase database, String tableName) {
            AbstractC3292y.i(database, "database");
            AbstractC3292y.i(tableName, "tableName");
            return new FtsTableInfo(tableName, readColumns(database, tableName), readOptions(database, tableName));
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public FtsTableInfo(String name, Set<String> columns, Set<String> options) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(columns, "columns");
        AbstractC3292y.i(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    @VisibleForTesting
    public static final Set<String> parseOptions(String str) {
        return Companion.parseOptions(str);
    }

    @SuppressLint({"SyntheticAccessor"})
    public static final FtsTableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo = (FtsTableInfo) obj;
        if (!AbstractC3292y.d(this.name, ftsTableInfo.name) || !AbstractC3292y.d(this.columns, ftsTableInfo.columns)) {
            return false;
        }
        return AbstractC3292y.d(this.options, ftsTableInfo.options);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.options.hashCode();
    }

    public String toString() {
        return "FtsTableInfo{name='" + this.name + "', columns=" + this.columns + ", options=" + this.options + "'}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(String name, Set<String> columns, String createSql) {
        this(name, columns, Companion.parseOptions(createSql));
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(columns, "columns");
        AbstractC3292y.i(createSql, "createSql");
    }
}

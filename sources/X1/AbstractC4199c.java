package x1;

import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import y1.C4236a;

/* renamed from: x1.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4199c {

    /* renamed from: a, reason: collision with root package name */
    private static String f40931a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";

    /* renamed from: b, reason: collision with root package name */
    private static Map f40932b = (Map) Stream.CC.of(new Object[]{'A', 0}, new Object[]{'B', 1}, new Object[]{'C', 2}, new Object[]{'D', 3}, new Object[]{'E', 4}, new Object[]{'F', 5}, new Object[]{'G', 6}, new Object[]{'H', 7}, new Object[]{'I', 8}, new Object[]{'J', 9}, new Object[]{'K', 10}, new Object[]{'L', 11}, new Object[]{'M', 12}, new Object[]{'N', 13}, new Object[]{'O', 14}, new Object[]{'P', 15}, new Object[]{'Q', 16}, new Object[]{'R', 17}, new Object[]{'S', 18}, new Object[]{'T', 19}, new Object[]{'U', 20}, new Object[]{'V', 21}, new Object[]{'W', 22}, new Object[]{'X', 23}, new Object[]{'Y', 24}, new Object[]{'Z', 25}, new Object[]{'a', 26}, new Object[]{'b', 27}, new Object[]{'c', 28}, new Object[]{'d', 29}, new Object[]{'e', 30}, new Object[]{'f', 31}, new Object[]{'g', 32}, new Object[]{'h', 33}, new Object[]{'i', 34}, new Object[]{'j', 35}, new Object[]{'k', 36}, new Object[]{'l', 37}, new Object[]{'m', 38}, new Object[]{'n', 39}, new Object[]{'o', 40}, new Object[]{'p', 41}, new Object[]{'q', 42}, new Object[]{'r', 43}, new Object[]{'s', 44}, new Object[]{'t', 45}, new Object[]{'u', 46}, new Object[]{'v', 47}, new Object[]{'w', 48}, new Object[]{'x', 49}, new Object[]{'y', 50}, new Object[]{'z', 51}, new Object[]{'0', 52}, new Object[]{'1', 53}, new Object[]{'2', 54}, new Object[]{'3', 55}, new Object[]{'4', 56}, new Object[]{'5', 57}, new Object[]{'6', 58}, new Object[]{'7', 59}, new Object[]{'8', 60}, new Object[]{'9', 61}, new Object[]{'-', 62}, new Object[]{'_', 63}).collect(Collectors.toMap(new Function() { // from class: x1.a
        public /* synthetic */ Function andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Character e8;
            e8 = AbstractC4199c.e((Object[]) obj);
            return e8;
        }

        public /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Function() { // from class: x1.b
        public /* synthetic */ Function andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Integer f8;
            f8 = AbstractC4199c.f((Object[]) obj);
            return f8;
        }

        public /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }));

    /* renamed from: c, reason: collision with root package name */
    private static Pattern f40933c = Pattern.compile("^[0-1]*$", 2);

    /* renamed from: d, reason: collision with root package name */
    private static Pattern f40934d = Pattern.compile("^[A-Za-z0-9\\-_]*$", 2);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Character e(Object[] objArr) {
        return (Character) objArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer f(Object[] objArr) {
        return (Integer) objArr[1];
    }

    public String c(String str) {
        if (f40934d.matcher(str).matches()) {
            String str2 = "";
            for (int i8 = 0; i8 < str.length(); i8++) {
                str2 = str2 + AbstractC4206j.b(((Integer) f40932b.get(Character.valueOf(str.charAt(i8)))).intValue(), 6);
            }
            return str2;
        }
        throw new C4236a("Undecodable Base64URL string");
    }

    public String d(String str) {
        if (f40933c.matcher(str).matches()) {
            String g8 = g(str);
            String str2 = "";
            int i8 = 0;
            while (i8 <= g8.length() - 6) {
                int i9 = i8 + 6;
                try {
                    str2 = str2 + Character.valueOf(f40931a.charAt(AbstractC4206j.a(g8.substring(i8, i9))));
                    i8 = i9;
                } catch (C4236a unused) {
                    throw new y1.b("Unencodable Base64Url '" + g8 + "'");
                }
            }
            return str2;
        }
        throw new y1.b("Unencodable Base64Url '" + str + "'");
    }

    protected abstract String g(String str);
}

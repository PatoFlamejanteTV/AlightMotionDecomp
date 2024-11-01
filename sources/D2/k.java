package d2;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class k {
    public static c a(Map map, String str) {
        String h8 = h(map, str);
        if (h8 == null) {
            return null;
        }
        return new c(h8);
    }

    public static boolean b(Map map, String str) {
        Boolean bool = (Boolean) c(map, str, Boolean.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new ParseException("JSON object member with key " + str + " is missing or null", 0);
    }

    private static Object c(Map map, String str, Class cls) {
        if (map.get(str) == null) {
            return null;
        }
        Object obj = map.get(str);
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        throw new ParseException("Unexpected type of JSON object member with key " + str + "", 0);
    }

    public static int d(Map map, String str) {
        Number number = (Number) c(map, str, Number.class);
        if (number != null) {
            return number.intValue();
        }
        throw new ParseException("JSON object member with key " + str + " is missing or null", 0);
    }

    public static List e(Map map, String str) {
        return (List) c(map, str, List.class);
    }

    public static Map f(Map map, String str) {
        Map map2 = (Map) c(map, str, Map.class);
        if (map2 == null) {
            return null;
        }
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                throw new ParseException("JSON object member with key " + str + " not a JSON object", 0);
            }
        }
        return map2;
    }

    public static long g(Map map, String str) {
        Number number = (Number) c(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException("JSON object member with key " + str + " is missing or null", 0);
    }

    public static String h(Map map, String str) {
        return (String) c(map, str, String.class);
    }

    public static String[] i(Map map, String str) {
        List e8 = e(map, str);
        if (e8 == null) {
            return null;
        }
        try {
            return (String[]) e8.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw new ParseException("JSON object member with key \"" + str + "\" is not an array of strings", 0);
        }
    }

    public static List j(Map map, String str) {
        String[] i8 = i(map, str);
        if (i8 == null) {
            return null;
        }
        return Arrays.asList(i8);
    }

    public static URI k(Map map, String str) {
        String h8 = h(map, str);
        if (h8 == null) {
            return null;
        }
        try {
            return new URI(h8);
        } catch (URISyntaxException e8) {
            throw new ParseException(e8.getMessage(), 0);
        }
    }

    public static Map l() {
        return new HashMap();
    }

    public static Map m(String str) {
        return n(str, -1);
    }

    public static Map n(String str, int i8) {
        if (i8 >= 0 && str.length() > i8) {
            throw new ParseException("The parsed string is longer than the max accepted size of " + i8 + " characters", 0);
        }
        try {
            Object b9 = new Z1.a(640).b(str);
            if (b9 instanceof X1.d) {
                return (X1.d) b9;
            }
            throw new ParseException("JSON entity is not an object", 0);
        } catch (Z1.e e8) {
            throw new ParseException("Invalid JSON: " + e8.getMessage(), 0);
        } catch (Exception e9) {
            throw new ParseException("Unexpected exception: " + e9.getMessage(), 0);
        } catch (StackOverflowError unused) {
            throw new ParseException("Excessive JSON object and / or array nesting", 0);
        }
    }

    public static String o(Map map) {
        return X1.d.a(map);
    }
}

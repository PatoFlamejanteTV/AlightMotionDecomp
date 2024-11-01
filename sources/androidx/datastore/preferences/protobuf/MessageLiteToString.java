package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MessageLiteToString {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, ' ');
    }

    private MessageLiteToString() {
    }

    private static void indent(int i8, StringBuilder sb) {
        int i9;
        while (i8 > 0) {
            char[] cArr = INDENT_BUFFER;
            if (i8 > cArr.length) {
                i9 = cArr.length;
            } else {
                i9 = i8;
            }
            sb.append(cArr, 0, i9);
            i8 -= i9;
        }
    }

    private static boolean isDefaultValue(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof Float) {
            if (Float.floatToRawIntBits(((Float) obj).floatValue()) == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof Double) {
            if (Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof ByteString) {
            return obj.equals(ByteString.EMPTY);
        }
        if (obj instanceof MessageLite) {
            if (obj == ((MessageLite) obj).getDefaultInstanceForType()) {
                return true;
            }
            return false;
        }
        if ((obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0) {
            return true;
        }
        return false;
    }

    private static String pascalCaseToSnakeCase(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i8 = 1; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void printField(StringBuilder sb, int i8, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                printField(sb, i8, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb, i8, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        indent(i8, sb);
        sb.append(pascalCaseToSnakeCase(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(TextFormatEscaper.escapeText((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(TextFormatEscaper.escapeBytes((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite) obj, sb, i8 + 2);
            sb.append("\n");
            indent(i8, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i9 = i8 + 2;
            printField(sb, i9, LeanbackPreferenceDialogFragment.ARG_KEY, entry.getKey());
            printField(sb, i9, "value", entry.getValue());
            sb.append("\n");
            indent(i8, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    private static void reflectivePrintWithIndent(MessageLite messageLite, StringBuilder sb, int i8) {
        int i9;
        boolean booleanValue;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            i9 = 3;
            if (i10 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i10];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i10++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i9);
            if (substring.endsWith(LIST_SUFFIX) && !substring.endsWith(BUILDER_LIST_SUFFIX) && !substring.equals(LIST_SUFFIX) && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                printField(sb, i8, substring.substring(0, substring.length() - 4), GeneratedMessageLite.invokeOrDie(method2, messageLite, new Object[0]));
            } else if (substring.endsWith(MAP_SUFFIX) && !substring.equals(MAP_SUFFIX) && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                printField(sb, i8, substring.substring(0, substring.length() - 3), GeneratedMessageLite.invokeOrDie(method, messageLite, new Object[0]));
            } else {
                if (hashSet.contains("set" + substring)) {
                    if (substring.endsWith(BYTES_SUFFIX)) {
                        if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                        }
                    }
                    java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                    java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has" + substring);
                    if (method4 != null) {
                        Object invokeOrDie = GeneratedMessageLite.invokeOrDie(method4, messageLite, new Object[0]);
                        if (method5 == null) {
                            if (!isDefaultValue(invokeOrDie)) {
                                booleanValue = true;
                            } else {
                                booleanValue = false;
                            }
                        } else {
                            booleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method5, messageLite, new Object[0])).booleanValue();
                        }
                        if (booleanValue) {
                            printField(sb, i8, substring, invokeOrDie);
                        }
                    }
                }
            }
            i9 = 3;
        }
        if (messageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator<Map.Entry<GeneratedMessageLite.ExtensionDescriptor, Object>> it = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.iterator();
            while (it.hasNext()) {
                Map.Entry<GeneratedMessageLite.ExtensionDescriptor, Object> next = it.next();
                printField(sb, i8, "[" + next.getKey().getNumber() + "]", next.getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) messageLite).unknownFields;
        if (unknownFieldSetLite != null) {
            unknownFieldSetLite.printWithIndent(sb, i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String toString(MessageLite messageLite, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        reflectivePrintWithIndent(messageLite, sb, 0);
        return sb.toString();
    }
}

package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21343a = "x";

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f21344b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f21345c;

    /* renamed from: d, reason: collision with root package name */
    private static byte[] f21346d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: e, reason: collision with root package name */
    private static char[] f21347e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap hashMap = new HashMap();
        f21344b = hashMap;
        hashMap.put('v', 'A');
        f21344b.put('S', 'B');
        f21344b.put('o', 'C');
        f21344b.put('a', 'D');
        f21344b.put('j', 'E');
        f21344b.put('c', 'F');
        f21344b.put('7', 'G');
        f21344b.put('d', 'H');
        f21344b.put('R', 'I');
        f21344b.put('z', 'J');
        f21344b.put('p', 'K');
        f21344b.put('W', 'L');
        f21344b.put('i', 'M');
        f21344b.put('f', 'N');
        f21344b.put('G', 'O');
        f21344b.put('y', 'P');
        f21344b.put('N', 'Q');
        f21344b.put('x', 'R');
        f21344b.put('Z', 'S');
        f21344b.put('n', 'T');
        f21344b.put('V', 'U');
        f21344b.put('5', 'V');
        f21344b.put('k', 'W');
        f21344b.put('+', 'X');
        f21344b.put('D', 'Y');
        f21344b.put('H', 'Z');
        f21344b.put('L', 'a');
        f21344b.put('Y', 'b');
        f21344b.put('h', 'c');
        f21344b.put('J', 'd');
        f21344b.put('4', 'e');
        f21344b.put('6', 'f');
        f21344b.put('l', 'g');
        f21344b.put('t', 'h');
        f21344b.put('0', 'i');
        f21344b.put('U', 'j');
        f21344b.put('3', 'k');
        f21344b.put('Q', 'l');
        f21344b.put('r', 'm');
        f21344b.put('g', 'n');
        f21344b.put('E', 'o');
        f21344b.put('u', 'p');
        f21344b.put('q', 'q');
        f21344b.put('8', 'r');
        f21344b.put('s', 's');
        f21344b.put('w', 't');
        f21344b.put('/', 'u');
        f21344b.put('X', 'v');
        f21344b.put('M', 'w');
        f21344b.put('e', 'x');
        f21344b.put('B', 'y');
        f21344b.put('A', 'z');
        f21344b.put('T', '0');
        f21344b.put('2', '1');
        f21344b.put('F', '2');
        f21344b.put('b', '3');
        f21344b.put('9', '4');
        f21344b.put('P', '5');
        f21344b.put('1', '6');
        f21344b.put('O', '7');
        f21344b.put('I', '8');
        f21344b.put('K', '9');
        f21344b.put('m', '+');
        f21344b.put('C', '/');
        HashMap hashMap2 = new HashMap();
        f21345c = hashMap2;
        hashMap2.put('A', 'v');
        f21345c.put('B', 'S');
        f21345c.put('C', 'o');
        f21345c.put('D', 'a');
        f21345c.put('E', 'j');
        f21345c.put('F', 'c');
        f21345c.put('G', '7');
        f21345c.put('H', 'd');
        f21345c.put('I', 'R');
        f21345c.put('J', 'z');
        f21345c.put('K', 'p');
        f21345c.put('L', 'W');
        f21345c.put('M', 'i');
        f21345c.put('N', 'f');
        f21345c.put('O', 'G');
        f21345c.put('P', 'y');
        f21345c.put('Q', 'N');
        f21345c.put('R', 'x');
        f21345c.put('S', 'Z');
        f21345c.put('T', 'n');
        f21345c.put('U', 'V');
        f21345c.put('V', '5');
        f21345c.put('W', 'k');
        f21345c.put('X', '+');
        f21345c.put('Y', 'D');
        f21345c.put('Z', 'H');
        f21345c.put('a', 'L');
        f21345c.put('b', 'Y');
        f21345c.put('c', 'h');
        f21345c.put('d', 'J');
        f21345c.put('e', '4');
        f21345c.put('f', '6');
        f21345c.put('g', 'l');
        f21345c.put('h', 't');
        f21345c.put('i', '0');
        f21345c.put('j', 'U');
        f21345c.put('k', '3');
        f21345c.put('l', 'Q');
        f21345c.put('m', 'r');
        f21345c.put('n', 'g');
        f21345c.put('o', 'E');
        f21345c.put('p', 'u');
        f21345c.put('q', 'q');
        f21345c.put('r', '8');
        f21345c.put('s', 's');
        f21345c.put('t', 'w');
        f21345c.put('u', '/');
        f21345c.put('v', 'X');
        f21345c.put('w', 'M');
        f21345c.put('x', 'e');
        f21345c.put('y', 'B');
        f21345c.put('z', 'A');
        f21345c.put('0', 'T');
        f21345c.put('1', '2');
        f21345c.put('2', 'F');
        f21345c.put('3', 'b');
        f21345c.put('4', '9');
        f21345c.put('5', 'P');
        f21345c.put('6', '1');
        f21345c.put('7', 'O');
        f21345c.put('8', 'I');
        f21345c.put('9', 'K');
        f21345c.put('+', 'm');
        f21345c.put('/', 'C');
    }

    private x() {
    }

    public static String a(String str) {
        return ae.a(str);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return ae.b(str);
    }
}

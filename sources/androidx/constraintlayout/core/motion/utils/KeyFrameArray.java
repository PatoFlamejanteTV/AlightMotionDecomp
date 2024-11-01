package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public class KeyFrameArray {

    /* loaded from: classes.dex */
    public static class CustomArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        CustomAttribute[] values = new CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void append(int i8, CustomAttribute customAttribute) {
            if (this.values[i8] != null) {
                remove(i8);
            }
            this.values[i8] = customAttribute;
            int[] iArr = this.keys;
            int i9 = this.count;
            this.count = i9 + 1;
            iArr[i9] = i8;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, 999);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            printStream.print("K: [");
            for (int i8 = 0; i8 < this.count; i8++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i8 == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(valueAt(i8));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i8) {
            return this.keys[i8];
        }

        public void remove(int i8) {
            this.values[i8] = null;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = this.count;
                if (i9 < i11) {
                    int[] iArr = this.keys;
                    if (i8 == iArr[i9]) {
                        iArr[i9] = 999;
                        i10++;
                    }
                    if (i9 != i10) {
                        iArr[i9] = iArr[i10];
                    }
                    i10++;
                    i9++;
                } else {
                    this.count = i11 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.count;
        }

        public CustomAttribute valueAt(int i8) {
            return this.values[this.keys[i8]];
        }
    }

    /* loaded from: classes.dex */
    public static class CustomVar {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        CustomVariable[] values = new CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void append(int i8, CustomVariable customVariable) {
            if (this.values[i8] != null) {
                remove(i8);
            }
            this.values[i8] = customVariable;
            int[] iArr = this.keys;
            int i9 = this.count;
            this.count = i9 + 1;
            iArr[i9] = i8;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, 999);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            printStream.print("K: [");
            for (int i8 = 0; i8 < this.count; i8++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i8 == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(valueAt(i8));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i8) {
            return this.keys[i8];
        }

        public void remove(int i8) {
            this.values[i8] = null;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = this.count;
                if (i9 < i11) {
                    int[] iArr = this.keys;
                    if (i8 == iArr[i9]) {
                        iArr[i9] = 999;
                        i10++;
                    }
                    if (i9 != i10) {
                        iArr[i9] = iArr[i10];
                    }
                    i10++;
                    i9++;
                } else {
                    this.count = i11 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.count;
        }

        public CustomVariable valueAt(int i8) {
            return this.values[this.keys[i8]];
        }
    }

    /* loaded from: classes.dex */
    static class FloatArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        float[][] values = new float[101];

        public FloatArray() {
            clear();
        }

        public void append(int i8, float[] fArr) {
            if (this.values[i8] != null) {
                remove(i8);
            }
            this.values[i8] = fArr;
            int[] iArr = this.keys;
            int i9 = this.count;
            this.count = i9 + 1;
            iArr[i9] = i8;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, 999);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            printStream.print("K: [");
            for (int i8 = 0; i8 < this.count; i8++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i8 == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(Arrays.toString(valueAt(i8)));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i8) {
            return this.keys[i8];
        }

        public void remove(int i8) {
            this.values[i8] = null;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = this.count;
                if (i9 < i11) {
                    int[] iArr = this.keys;
                    if (i8 == iArr[i9]) {
                        iArr[i9] = 999;
                        i10++;
                    }
                    if (i9 != i10) {
                        iArr[i9] = iArr[i10];
                    }
                    i10++;
                    i9++;
                } else {
                    this.count = i11 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.count;
        }

        public float[] valueAt(int i8) {
            return this.values[this.keys[i8]];
        }
    }
}

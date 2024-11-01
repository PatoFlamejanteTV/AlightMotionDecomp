package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;

/* loaded from: classes.dex */
public class KeyParser {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface DataType {
        int get(int i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface Ids {
        int get(String str);
    }

    public static void main(String[] strArr) {
        parseAttributes("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    private static TypedBundle parse(String str, Ids ids, DataType dataType) {
        TypedBundle typedBundle = new TypedBundle();
        try {
            CLObject parse = CLParser.parse(str);
            int size = parse.size();
            for (int i8 = 0; i8 < size; i8++) {
                CLKey cLKey = (CLKey) parse.get(i8);
                String content = cLKey.content();
                CLElement value = cLKey.getValue();
                int i9 = ids.get(content);
                if (i9 == -1) {
                    System.err.println("unknown type " + content);
                } else {
                    int i10 = dataType.get(i9);
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 4) {
                                if (i10 == 8) {
                                    typedBundle.add(i9, value.content());
                                    System.out.println("parse " + content + " STRING_MASK > " + value.content());
                                }
                            } else {
                                typedBundle.add(i9, value.getFloat());
                                System.out.println("parse " + content + " FLOAT_MASK > " + value.getFloat());
                            }
                        } else {
                            typedBundle.add(i9, value.getInt());
                            System.out.println("parse " + content + " INT_MASK > " + value.getInt());
                        }
                    } else {
                        typedBundle.add(i9, parse.getBoolean(i8));
                    }
                }
            }
        } catch (CLParsingException e8) {
            e8.printStackTrace();
        }
        return typedBundle;
    }

    public static TypedBundle parseAttributes(String str) {
        return parse(str, new Ids() { // from class: androidx.constraintlayout.core.motion.parse.a
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.Ids
            public final int get(String str2) {
                return androidx.constraintlayout.core.motion.utils.a.a(str2);
            }
        }, new DataType() { // from class: androidx.constraintlayout.core.motion.parse.b
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.DataType
            public final int get(int i8) {
                return androidx.constraintlayout.core.motion.utils.a.b(i8);
            }
        });
    }
}

package com.mbridge.msdk.dycreator.a;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    private static final Class[] f19475f = {Context.class, AttributeSet.class};

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap<String, Constructor> f19476g = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static String f19477j = "com.mbridge.msdk.dycreator.baseview.MB";

    /* renamed from: a, reason: collision with root package name */
    protected final Context f19478a;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0392a f19480c;

    /* renamed from: d, reason: collision with root package name */
    private b f19481d;

    /* renamed from: h, reason: collision with root package name */
    private HashMap<String, Boolean> f19483h;

    /* renamed from: i, reason: collision with root package name */
    private long f19484i;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19479b = true;

    /* renamed from: e, reason: collision with root package name */
    private final Object[] f19482e = new Object[2];

    /* renamed from: com.mbridge.msdk.dycreator.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0392a {
        View a(String str, Context context, AttributeSet attributeSet);
    }

    /* loaded from: classes4.dex */
    public interface b {
        boolean a(Class cls);
    }

    public a(Context context) {
        this.f19478a = context;
    }

    private XmlPullParser a(String str) {
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setInput(new FileInputStream(str), "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return newPullParser;
    }

    private void b(String str, String str2, AttributeSet attributeSet) {
        StringBuilder sb = new StringBuilder();
        sb.append(attributeSet.getPositionDescription());
        sb.append(": Class not allowed to be inflated ");
        if (str2 != null) {
            str = str2 + str;
        }
        sb.append(str);
        throw new InflateException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View] */
    private View a(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z8) {
        int next;
        ViewGroup.LayoutParams layoutParams;
        synchronized (this.f19482e) {
            try {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                this.f19482e[0] = this.f19478a;
                do {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    PrintStream printStream = System.out;
                    printStream.println("**************************");
                    printStream.println("Creating root view: " + name);
                    printStream.println("**************************");
                    if (!"merge".equals(name)) {
                        View a9 = a(name, asAttributeSet);
                        if (viewGroup != 0) {
                            printStream.println("Creating params from root: " + ((Object) viewGroup));
                            layoutParams = viewGroup.generateLayoutParams(asAttributeSet);
                            if (!z8) {
                                a9.setLayoutParams(layoutParams);
                            }
                        } else {
                            layoutParams = null;
                        }
                        printStream.println("-----> start inflating children");
                        a(xmlPullParser, a9, asAttributeSet);
                        printStream.println("-----> done inflating children");
                        if (viewGroup != 0 && z8) {
                            viewGroup.addView(a9, layoutParams);
                        }
                        if (viewGroup == 0 || !z8) {
                            viewGroup = a9;
                        }
                    } else if (viewGroup != 0 && z8) {
                        a(xmlPullParser, (View) viewGroup, asAttributeSet);
                    } else {
                        throw new InflateException("<merge /> can be used only with a valid ViewGroup root and attachToRoot=true");
                    }
                } else {
                    throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
                }
            } catch (IOException e8) {
                InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e8.getMessage());
                inflateException.initCause(e8);
                throw inflateException;
            } catch (XmlPullParserException e9) {
                InflateException inflateException2 = new InflateException(e9.getMessage());
                inflateException2.initCause(e9);
                throw inflateException2;
            } finally {
            }
        }
        return viewGroup;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:            if (r8 != null) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:            r2.setLayoutParams(r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:            a(r0, r2, r1);        r7.addView(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007b, code lost:            if (r8 == null) goto L34;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(org.xmlpull.v1.XmlPullParser r6, android.view.View r7, android.util.AttributeSet r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lbc
            r0 = 0
            r1 = 0
            java.lang.String r2 = "layout"
            int r0 = r8.getAttributeResourceValue(r1, r2, r0)
            if (r0 != 0) goto L38
            java.lang.String r6 = r8.getAttributeValue(r1, r2)
            if (r6 != 0) goto L1c
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.String r7 = "You must specifiy a layout in the include tag: <include layout=\"@layout/layoutID\" />"
            r6.<init>(r7)
            throw r6
        L1c:
            android.view.InflateException r7 = new android.view.InflateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "You must specifiy a valid layout reference. The layout ID "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = " is not valid."
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L38:
            android.content.Context r1 = r5.f19478a
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.XmlResourceParser r0 = r1.getLayout(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)     // Catch: java.lang.Throwable -> L63
        L46:
            int r2 = r0.next()     // Catch: java.lang.Throwable -> L63
            r3 = 1
            r4 = 2
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            goto L46
        L51:
            if (r2 != r4) goto L9d
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = "merge"
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L65
            r5.a(r0, r7, r1)     // Catch: java.lang.Throwable -> L63
            goto L84
        L63:
            r6 = move-exception
            goto Lb8
        L65:
            android.view.View r2 = r5.a(r2, r1)     // Catch: java.lang.Throwable -> L63
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch: java.lang.Throwable -> L63
            android.view.ViewGroup$LayoutParams r8 = r7.generateLayoutParams(r8)     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L77
            if (r8 == 0) goto L7e
        L71:
            r2.setLayoutParams(r8)     // Catch: java.lang.Throwable -> L63
            goto L7e
        L75:
            r6 = move-exception
            goto L9c
        L77:
            android.view.ViewGroup$LayoutParams r8 = r7.generateLayoutParams(r1)     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L7e
            goto L71
        L7e:
            r5.a(r0, r2, r1)     // Catch: java.lang.Throwable -> L63
            r7.addView(r2)     // Catch: java.lang.Throwable -> L63
        L84:
            r0.close()
            int r7 = r6.getDepth()
        L8b:
            int r8 = r6.next()
            r0 = 3
            if (r8 != r0) goto L98
            int r0 = r6.getDepth()
            if (r0 <= r7) goto L9b
        L98:
            if (r8 == r3) goto L9b
            goto L8b
        L9b:
            return
        L9c:
            throw r6     // Catch: java.lang.Throwable -> L63
        L9d:
            android.view.InflateException r6 = new android.view.InflateException     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r7.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r8 = r0.getPositionDescription()     // Catch: java.lang.Throwable -> L63
            r7.append(r8)     // Catch: java.lang.Throwable -> L63
            java.lang.String r8 = ": No start tag found!"
            r7.append(r8)     // Catch: java.lang.Throwable -> L63
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L63
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L63
            throw r6     // Catch: java.lang.Throwable -> L63
        Lb8:
            r0.close()
            throw r6
        Lbc:
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.String r7 = "<include /> can only be used inside of a ViewGroup"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.a.a.b(org.xmlpull.v1.XmlPullParser, android.view.View, android.util.AttributeSet):void");
    }

    private View a(String str, String str2, AttributeSet attributeSet) throws ClassNotFoundException, InflateException {
        String str3;
        String str4;
        HashMap<String, Constructor> hashMap = f19476g;
        Constructor<?> constructor = hashMap.get(str);
        Class<?> cls = null;
        try {
            if (constructor == null) {
                ClassLoader classLoader = this.f19478a.getClassLoader();
                if (str2 != null) {
                    str4 = str2 + str;
                } else {
                    str4 = str;
                }
                cls = classLoader.loadClass(str4);
                b bVar = this.f19481d;
                if (bVar != null && cls != null && !bVar.a(cls)) {
                    b(str, str2, attributeSet);
                }
                constructor = cls.getConstructor(f19475f);
                hashMap.put(str, constructor);
            } else if (this.f19481d != null) {
                Boolean bool = this.f19483h.get(str);
                if (bool == null) {
                    ClassLoader classLoader2 = this.f19478a.getClassLoader();
                    if (str2 != null) {
                        str3 = str2 + str;
                    } else {
                        str3 = str;
                    }
                    cls = classLoader2.loadClass(str3);
                    boolean z8 = cls != null && this.f19481d.a(cls);
                    this.f19483h.put(str, Boolean.valueOf(z8));
                    if (!z8) {
                        b(str, str2, attributeSet);
                    }
                } else if (bool.equals(Boolean.FALSE)) {
                    b(str, str2, attributeSet);
                }
            }
            Object[] objArr = this.f19482e;
            objArr[1] = attributeSet;
            return (View) constructor.newInstance(objArr);
        } catch (ClassNotFoundException e8) {
            throw e8;
        } catch (NoSuchMethodException e9) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Error inflating class ");
            if (str2 != null) {
                str = str2 + str;
            }
            sb.append(str);
            InflateException inflateException = new InflateException(sb.toString());
            inflateException.initCause(e9);
            throw inflateException;
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attributeSet.getPositionDescription());
            sb2.append(": Error inflating class ");
            sb2.append(cls == null ? "<unknown>" : cls.getName());
            InflateException inflateException2 = new InflateException(sb2.toString());
            inflateException2.initCause(e10);
            throw inflateException2;
        }
    }

    private View a(String str, AttributeSet attributeSet) {
        View a9;
        if (str.equals(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        PrintStream printStream = System.out;
        printStream.println("******** Creating view: " + str);
        try {
            InterfaceC0392a interfaceC0392a = this.f19480c;
            View a10 = interfaceC0392a == null ? null : interfaceC0392a.a(str, this.f19478a, attributeSet);
            if (a10 == null) {
                if (-1 == str.indexOf(46)) {
                    if (!str.equals("MBStarLevelLayoutView") && !str.equals("LuckPan")) {
                        a9 = a(str, f19477j, attributeSet);
                        a10 = a9;
                    }
                    a9 = a(str, "", attributeSet);
                    a10 = a9;
                } else {
                    a10 = a(str, (String) null, attributeSet);
                }
            }
            printStream.println("Created view is: " + a10);
            return a10;
        } catch (InflateException e8) {
            throw e8;
        } catch (ClassNotFoundException e9) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException.initCause(e9);
            throw inflateException;
        } catch (Exception e10) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e10);
            throw inflateException2;
        }
    }

    private void a(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int next;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next2 = xmlPullParser.next();
            if ((next2 == 3 && xmlPullParser.getDepth() <= depth) || next2 == 1) {
                return;
            }
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                if ("requestFocus".equals(name)) {
                    view.requestFocus();
                    int depth2 = xmlPullParser.getDepth();
                    do {
                        next = xmlPullParser.next();
                        if (next != 3 || xmlPullParser.getDepth() > depth2) {
                        }
                    } while (next != 1);
                } else if ("include".equals(name)) {
                    if (xmlPullParser.getDepth() != 0) {
                        b(xmlPullParser, view, attributeSet);
                    } else {
                        throw new InflateException("<include /> cannot be the root element");
                    }
                } else if (!"merge".equals(name)) {
                    View a9 = a(name, attributeSet);
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroup.LayoutParams generateLayoutParams = viewGroup.generateLayoutParams(attributeSet);
                    a(xmlPullParser, a9, attributeSet);
                    viewGroup.addView(a9, generateLayoutParams);
                } else {
                    throw new InflateException("<merge /> must be the root element");
                }
            }
        }
    }

    public final View a(String str, ViewGroup viewGroup) {
        boolean z8 = viewGroup != null;
        this.f19484i = System.currentTimeMillis();
        System.out.println("INFLATING from resource: " + str);
        return a(a(str), viewGroup, z8);
    }
}

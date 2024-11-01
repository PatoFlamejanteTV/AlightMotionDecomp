package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class PreferenceInflater {
    private static final String EXTRA_TAG_NAME = "extra";
    private static final String INTENT_TAG_NAME = "intent";
    private final Object[] mConstructorArgs = new Object[2];

    @NonNull
    private final Context mContext;
    private String[] mDefaultPackages;
    private PreferenceManager mPreferenceManager;
    private static final Class<?>[] CONSTRUCTOR_SIGNATURE = {Context.class, AttributeSet.class};
    private static final HashMap<String, Constructor<?>> CONSTRUCTOR_MAP = new HashMap<>();

    public PreferenceInflater(@NonNull Context context, PreferenceManager preferenceManager) {
        this.mContext = context;
        init(preferenceManager);
    }

    private Preference createItem(@NonNull String str, @Nullable String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException, InflateException {
        Class<?> cls;
        Constructor<?> constructor = CONSTRUCTOR_MAP.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.mContext.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e8 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e9) {
                                e8 = e9;
                            }
                        }
                        if (cls == null) {
                            if (e8 == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e8;
                        }
                        constructor = cls.getConstructor(CONSTRUCTOR_SIGNATURE);
                        constructor.setAccessible(true);
                        CONSTRUCTOR_MAP.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(CONSTRUCTOR_SIGNATURE);
                    constructor.setAccessible(true);
                    CONSTRUCTOR_MAP.put(str, constructor);
                } catch (ClassNotFoundException e10) {
                    throw e10;
                }
            } catch (Exception e11) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e11);
                throw inflateException;
            }
        }
        Object[] objArr = this.mConstructorArgs;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private Preference createItemFromTag(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return onCreateItem(str, attributeSet);
            }
            return createItem(str, null, attributeSet);
        } catch (InflateException e8) {
            throw e8;
        } catch (ClassNotFoundException e9) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e9);
            throw inflateException;
        } catch (Exception e10) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e10);
            throw inflateException2;
        }
    }

    private void init(PreferenceManager preferenceManager) {
        this.mPreferenceManager = preferenceManager;
        setDefaultPackages(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    @NonNull
    private PreferenceGroup onMergeRoots(PreferenceGroup preferenceGroup, @NonNull PreferenceGroup preferenceGroup2) {
        if (preferenceGroup == null) {
            preferenceGroup2.onAttachedToHierarchy(this.mPreferenceManager);
            return preferenceGroup2;
        }
        return preferenceGroup;
    }

    private void rInflate(@NonNull XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (INTENT_TAG_NAME.equals(name)) {
                        try {
                            preference.setIntent(Intent.parseIntent(getContext().getResources(), xmlPullParser, attributeSet));
                        } catch (IOException e8) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e8);
                            throw xmlPullParserException;
                        }
                    } else if (EXTRA_TAG_NAME.equals(name)) {
                        getContext().getResources().parseBundleExtra(EXTRA_TAG_NAME, attributeSet, preference.getExtras());
                        try {
                            skipCurrentTag(xmlPullParser);
                        } catch (IOException e9) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e9);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference createItemFromTag = createItemFromTag(name, attributeSet);
                        ((PreferenceGroup) preference).addItemFromInflater(createItemFromTag);
                        rInflate(xmlPullParser, createItemFromTag, attributeSet);
                    }
                }
            } else {
                return;
            }
        }
    }

    private static void skipCurrentTag(@NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next == 3 && xmlPullParser.getDepth() <= depth) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public String[] getDefaultPackages() {
        return this.mDefaultPackages;
    }

    @NonNull
    public Preference inflate(int i8, @Nullable PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = getContext().getResources().getXml(i8);
        try {
            return inflate(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    protected Preference onCreateItem(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return createItem(str, this.mDefaultPackages, attributeSet);
    }

    public void setDefaultPackages(String[] strArr) {
        this.mDefaultPackages = strArr;
    }

    @NonNull
    public Preference inflate(XmlPullParser xmlPullParser, @Nullable PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup onMergeRoots;
        synchronized (this.mConstructorArgs) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.mConstructorArgs[0] = this.mContext;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e8) {
                    throw e8;
                } catch (IOException e9) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e9.getMessage());
                    inflateException.initCause(e9);
                    throw inflateException;
                } catch (XmlPullParserException e10) {
                    InflateException inflateException2 = new InflateException(e10.getMessage());
                    inflateException2.initCause(e10);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                onMergeRoots = onMergeRoots(preferenceGroup, (PreferenceGroup) createItemFromTag(xmlPullParser.getName(), asAttributeSet));
                rInflate(xmlPullParser, onMergeRoots, asAttributeSet);
            } else {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
        }
        return onMergeRoots;
    }
}

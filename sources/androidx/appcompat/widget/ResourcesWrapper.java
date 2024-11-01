package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import androidx.core.content.res.ResourcesCompat;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ResourcesWrapper extends Resources {
    private final Resources mResources;

    public ResourcesWrapper(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mResources = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i8) throws Resources.NotFoundException {
        return this.mResources.getAnimation(i8);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i8) throws Resources.NotFoundException {
        return this.mResources.getBoolean(i8);
    }

    @Override // android.content.res.Resources
    public int getColor(int i8) throws Resources.NotFoundException {
        return this.mResources.getColor(i8);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i8) throws Resources.NotFoundException {
        return this.mResources.getColorStateList(i8);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.mResources.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i8) throws Resources.NotFoundException {
        return this.mResources.getDimension(i8);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i8) throws Resources.NotFoundException {
        return this.mResources.getDimensionPixelOffset(i8);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i8) throws Resources.NotFoundException {
        return this.mResources.getDimensionPixelSize(i8);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.mResources.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i8) throws Resources.NotFoundException {
        return this.mResources.getDrawable(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable getDrawableCanonical(int i8) throws Resources.NotFoundException {
        return super.getDrawable(i8);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i8, int i9) throws Resources.NotFoundException {
        return ResourcesCompat.getDrawableForDensity(this.mResources, i8, i9, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i8, int i9, int i10) {
        return this.mResources.getFraction(i8, i9, i10);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.mResources.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i8) throws Resources.NotFoundException {
        return this.mResources.getIntArray(i8);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i8) throws Resources.NotFoundException {
        return this.mResources.getInteger(i8);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i8) throws Resources.NotFoundException {
        return this.mResources.getLayout(i8);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i8) throws Resources.NotFoundException {
        return this.mResources.getMovie(i8);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i8, int i9, Object... objArr) throws Resources.NotFoundException {
        return this.mResources.getQuantityString(i8, i9, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i8, int i9) throws Resources.NotFoundException {
        return this.mResources.getQuantityText(i8, i9);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i8) throws Resources.NotFoundException {
        return this.mResources.getResourceEntryName(i8);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i8) throws Resources.NotFoundException {
        return this.mResources.getResourceName(i8);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i8) throws Resources.NotFoundException {
        return this.mResources.getResourcePackageName(i8);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i8) throws Resources.NotFoundException {
        return this.mResources.getResourceTypeName(i8);
    }

    @Override // android.content.res.Resources
    public String getString(int i8) throws Resources.NotFoundException {
        return this.mResources.getString(i8);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i8) throws Resources.NotFoundException {
        return this.mResources.getStringArray(i8);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i8) throws Resources.NotFoundException {
        return this.mResources.getText(i8);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i8) throws Resources.NotFoundException {
        return this.mResources.getTextArray(i8);
    }

    @Override // android.content.res.Resources
    public void getValue(int i8, TypedValue typedValue, boolean z8) throws Resources.NotFoundException {
        this.mResources.getValue(i8, typedValue, z8);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i8, int i9, TypedValue typedValue, boolean z8) throws Resources.NotFoundException {
        this.mResources.getValueForDensity(i8, i9, typedValue, z8);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i8) throws Resources.NotFoundException {
        return this.mResources.getXml(i8);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.mResources.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i8) throws Resources.NotFoundException {
        return this.mResources.obtainTypedArray(i8);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i8) throws Resources.NotFoundException {
        return this.mResources.openRawResource(i8);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i8) throws Resources.NotFoundException {
        return this.mResources.openRawResourceFd(i8);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.mResources.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.mResources.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.mResources;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    @RequiresApi(21)
    public Drawable getDrawable(int i8, Resources.Theme theme) throws Resources.NotFoundException {
        return ResourcesCompat.getDrawable(this.mResources, i8, theme);
    }

    @Override // android.content.res.Resources
    @RequiresApi(21)
    public Drawable getDrawableForDensity(int i8, int i9, Resources.Theme theme) {
        return ResourcesCompat.getDrawableForDensity(this.mResources, i8, i9, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i8, int i9) throws Resources.NotFoundException {
        return this.mResources.getQuantityString(i8, i9);
    }

    @Override // android.content.res.Resources
    public String getString(int i8, Object... objArr) throws Resources.NotFoundException {
        return this.mResources.getString(i8, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i8, CharSequence charSequence) {
        return this.mResources.getText(i8, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z8) throws Resources.NotFoundException {
        this.mResources.getValue(str, typedValue, z8);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i8, TypedValue typedValue) throws Resources.NotFoundException {
        return this.mResources.openRawResource(i8, typedValue);
    }
}

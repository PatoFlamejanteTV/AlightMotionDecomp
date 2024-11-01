package U7;

import com.inmobi.cmp.data.model.ChoiceColor;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ChoiceColor f10263a;

    /* renamed from: b, reason: collision with root package name */
    public final W7.a f10264b;

    public b(ChoiceColor choiceColor, W7.a resolver) {
        AbstractC3292y.i(resolver, "resolver");
        this.f10263a = choiceColor;
        this.f10264b = resolver;
    }

    @Override // U7.a
    public Object a(U5.d dVar) {
        ChoiceColor colorResources = this.f10263a;
        if (colorResources == null) {
            return null;
        }
        this.f10264b.getClass();
        AbstractC3292y.i(colorResources, "colorResources");
        return new S7.c(colorResources.getDividerColor(), colorResources.getTabBackgroundColor(), colorResources.getSearchBarBackgroundColor(), colorResources.getSearchBarForegroundColor(), colorResources.getToggleActiveColor(), colorResources.getToggleInactiveColor(), colorResources.getGlobalBackgroundColor(), colorResources.getTitleTextColor(), colorResources.getBodyTextColor(), colorResources.getTabTextColor(), colorResources.getMenuTextColor(), colorResources.getLinkTextColor(), colorResources.getButtonTextColor(), colorResources.getButtonDisabledTextColor(), colorResources.getButtonBackgroundColor(), colorResources.getButtonDisabledBackgroundColor());
    }
}

package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public interface ApiOrBuilder extends MessageLiteOrBuilder {
    Method getMethods(int i8);

    int getMethodsCount();

    List<Method> getMethodsList();

    Mixin getMixins(int i8);

    int getMixinsCount();

    List<Mixin> getMixinsList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int i8);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    String getVersion();

    ByteString getVersionBytes();

    boolean hasSourceContext();
}

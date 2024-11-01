package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public interface EnumOrBuilder extends MessageLiteOrBuilder {
    EnumValue getEnumvalue(int i8);

    int getEnumvalueCount();

    List<EnumValue> getEnumvalueList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int i8);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}

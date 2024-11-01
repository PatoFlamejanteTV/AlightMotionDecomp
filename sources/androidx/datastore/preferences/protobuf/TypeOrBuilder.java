package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public interface TypeOrBuilder extends MessageLiteOrBuilder {
    Field getFields(int i8);

    int getFieldsCount();

    List<Field> getFieldsList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int i8);

    ByteString getOneofsBytes(int i8);

    int getOneofsCount();

    List<String> getOneofsList();

    Option getOptions(int i8);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}

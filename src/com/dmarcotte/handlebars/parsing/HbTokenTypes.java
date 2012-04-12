package com.dmarcotte.handlebars.parsing;

import com.dmarcotte.handlebars.HbLanguage;
import com.intellij.openapi.fileTypes.StdFileTypes;
import com.intellij.psi.templateLanguages.TemplateDataElementType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;

public class HbTokenTypes {

    /**
     * private constructor since this is a constants class
     */
    private HbTokenTypes() {}

    public static final IElementType CLOSEBLOCK_STACHE = new HbCompositeElementType("CLOSEBLOCK_STACHE");
    public static final IElementType HASH = new HbCompositeElementType("HASH");
    public static final IElementType HASH_SEGMENT = new HbCompositeElementType("HASH_SEGMENT");
    public static final IElementType HASH_SEGMENTS = new HbCompositeElementType("HASH_SEGMENTS");
    public static final IElementType IN_MUSTACHE = new HbCompositeElementType("IN_MUSTACHE");
    public static final IElementType MUSTACHE = new HbCompositeElementType("MUSTACHE");
    public static final IElementType BLOCK_STACHE = new HbCompositeElementType("BLOCK_STACHE");
    public static final IElementType INVERSE_STACHE = new HbCompositeElementType("INVERSE_STACHE");
    public static final IElementType PARAM = new HbCompositeElementType("PARAM");
    public static final IElementType PARAMS = new HbCompositeElementType("PARAMS");
    public static final IElementType PARTIAL_STACHE = new HbCompositeElementType("PARTIAL_STACHE");
    public static final IElementType PATH = new HbCompositeElementType("PATH");
    public static final IElementType PATH_SEGMENTS = new HbCompositeElementType("PATH_SEGMENTS");
    public static final IElementType PROGRAM = new HbCompositeElementType("PROGRAM");
    public static final IElementType SIMPLE_INVERSE = new HbCompositeElementType("SIMPLE_INVERSE");
    public static final IElementType STATEMENT = new HbCompositeElementType("STATEMENT");
    public static final IElementType STATEMENTS = new HbCompositeElementType("STATEMENTS");

    public static final IElementType CONTENT = new HbElementType("CONTENT");
    public static final IElementType OUTER_ELEMENT_TYPE = new HbElementType("HB_FRAGMENT");
    public static final TemplateDataElementType TEMPLATE_ELEMENT_TYPE =
            new TemplateDataElementType("HB_TEMPLATE_DATA", StdFileTypes.HTML.getLanguage(), CONTENT, OUTER_ELEMENT_TYPE);

    public static final IElementType WHITE_SPACE = new HbElementType("WHITE_SPACE");
    public static final IElementType COMMENT = new HbElementType("COMMENT");

    public static final IElementType OPEN = new HbElementType("OPEN");
    public static final IElementType OPEN_BLOCK = new HbElementType("OPEN_BLOCK");
    public static final IElementType OPEN_PARTIAL = new HbElementType("OPEN_PARTIAL");
    public static final IElementType OPEN_ENDBLOCK = new HbElementType("OPEN_ENDBLOCK");
    public static final IElementType OPEN_INVERSE = new HbElementType("OPEN_INVERSE");
    public static final IElementType OPEN_UNESCAPED = new HbElementType("OPEN_UNESCAPED");
    public static final IElementType EQUALS = new HbElementType("EQUALS");
    public static final IElementType ID = new HbElementType("ID");
    public static final IElementType SEP = new HbElementType("SEP");
    public static final IElementType CLOSE = new HbElementType("CLOSE");
    public static final IElementType BOOLEAN = new HbElementType("BOOLEAN");
    public static final IElementType INTEGER = new HbElementType("INTEGER");
    public static final IElementType STRING = new HbElementType("STRING");
    public static final IElementType INVALID = new HbElementType("INVALID");

    public static final IFileElementType FILE = new IFileElementType("FILE", HbLanguage.INSTANCE);

    public static final TokenSet WHITESPACES = TokenSet.create(WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(COMMENT);
    public static final TokenSet STRING_LITERALS = TokenSet.create(STRING);
}

// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.arguments", base = PyObject.class)
public class argumentsType extends PythonTree {
    public static final PyType TYPE = PyType.fromClass(argumentsType.class);
    private java.util.List<exprType> args;
    public java.util.List<exprType> getInternalArgs() {
        return args;
    }
    @ExposedGet(name = "args")
    public PyObject getArgs() {
        return new AstList(args, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "args")
    public void setArgs(PyObject args) {
        this.args = AstAdapters.to_exprList(args);
    }

    private String vararg;
    public String getInternalVararg() {
        return vararg;
    }
    @ExposedGet(name = "vararg")
    public PyObject getVararg() {
        if (vararg == null) return Py.None;
        return new PyString(vararg);
    }
    @ExposedSet(name = "vararg")
    public void setVararg(PyObject vararg) {
        this.vararg = AstAdapters.to_identifier(vararg);
    }

    private String kwarg;
    public String getInternalKwarg() {
        return kwarg;
    }
    @ExposedGet(name = "kwarg")
    public PyObject getKwarg() {
        if (kwarg == null) return Py.None;
        return new PyString(kwarg);
    }
    @ExposedSet(name = "kwarg")
    public void setKwarg(PyObject kwarg) {
        this.kwarg = AstAdapters.to_identifier(kwarg);
    }

    private java.util.List<exprType> defaults;
    public java.util.List<exprType> getInternalDefaults() {
        return defaults;
    }
    @ExposedGet(name = "defaults")
    public PyObject getDefaults() {
        return new AstList(defaults, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "defaults")
    public void setDefaults(PyObject defaults) {
        this.defaults = AstAdapters.to_exprList(defaults);
    }


    private final static String[] fields = new String[] {"args", "vararg",
                                                          "kwarg", "defaults"};
@ExposedGet(name = "_fields")
    public String[] get_fields() { return fields; }

    public argumentsType() {
        this(TYPE);
    }
    public argumentsType(PyType subType) {
        super(subType);
    }
    @ExposedNew
    @ExposedMethod
    public void Module___init__(PyObject[] args, String[] keywords) {}
    public argumentsType(PyObject args, PyObject vararg, PyObject kwarg,
    PyObject defaults) {
        setArgs(args);
        setVararg(vararg);
        setKwarg(kwarg);
        setDefaults(defaults);
    }

    public argumentsType(Token token, java.util.List<exprType> args, String
    vararg, String kwarg, java.util.List<exprType> defaults) {
        super(token);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<exprType>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = defaults;
        if (defaults == null) {
            this.defaults = new ArrayList<exprType>();
        }
        for(PythonTree t : this.defaults) {
            addChild(t);
        }
    }

    public argumentsType(Integer ttype, Token token, java.util.List<exprType>
    args, String vararg, String kwarg, java.util.List<exprType> defaults) {
        super(ttype, token);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<exprType>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = defaults;
        if (defaults == null) {
            this.defaults = new ArrayList<exprType>();
        }
        for(PythonTree t : this.defaults) {
            addChild(t);
        }
    }

    public argumentsType(PythonTree tree, java.util.List<exprType> args, String
    vararg, String kwarg, java.util.List<exprType> defaults) {
        super(tree);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<exprType>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = defaults;
        if (defaults == null) {
            this.defaults = new ArrayList<exprType>();
        }
        for(PythonTree t : this.defaults) {
            addChild(t);
        }
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "arguments";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("arguments(");
        sb.append("args=");
        sb.append(dumpThis(args));
        sb.append(",");
        sb.append("vararg=");
        sb.append(dumpThis(vararg));
        sb.append(",");
        sb.append("kwarg=");
        sb.append(dumpThis(kwarg));
        sb.append(",");
        sb.append("defaults=");
        sb.append(dumpThis(defaults));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (args != null) {
            for (PythonTree t : args) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (defaults != null) {
            for (PythonTree t : defaults) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

}

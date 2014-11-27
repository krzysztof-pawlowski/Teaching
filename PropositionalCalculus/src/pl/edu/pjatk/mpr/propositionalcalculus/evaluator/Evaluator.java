package pl.edu.pjatk.mpr.propositionalcalculus.evaluator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcLexer;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser;

public class Evaluator {

	private static ParseTree generateParseTree(ANTLRInputStream input) {
		PropCalcLexer lexer = new PropCalcLexer(input);
	 	CommonTokenStream tokens = new CommonTokenStream(lexer);
		PropCalcParser parser = new PropCalcParser(tokens);
		return parser.s(); 
	}
	
	public static void main(String[] args) throws IOException {
		//String formula = "p impl q equiv neg p impl neg q";
		//String formula = "p or q\u001a";
		
		InputStream is = System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
		
		boolean pValue = true;
		boolean qvalue = false;
		
		ParseTree tree = generateParseTree(input);
		
		EvalVisitor evalVisitor = new EvalVisitor(pValue, qvalue);
		Boolean result = evalVisitor.visit(tree);
		System.out.println(result);
	}
	
}

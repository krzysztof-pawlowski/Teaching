package pl.edu.pjatk.mpr.propositionalcalculus.evaluator;

import org.antlr.v4.runtime.misc.NotNull;

import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcBaseVisitor;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.AndContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.EquivContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.ImplContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.NegContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.OrContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.PNodeContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.ParensContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.QNodeContext;

public class EvalVisitor extends PropCalcBaseVisitor<Boolean> {

	private boolean pValue;
	private boolean qValue;
	
	public EvalVisitor(boolean pValue, boolean qValue) {
		this.pValue = pValue;
		this.qValue = qValue;
	}

	@Override 
	public Boolean visitNeg(@NotNull PropCalcParser.NegContext ctx) { 
		return !visit(ctx.s4());
	}
	
	@Override 
	public Boolean visitImpl(@NotNull PropCalcParser.ImplContext ctx) {
		Boolean leftValue = visit(ctx.s2());
		Boolean rightValue = visit(ctx.s3());
		if (leftValue && !rightValue) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override 
	public Boolean visitParens(@NotNull PropCalcParser.ParensContext ctx) { 
		return visit(ctx.s());
	}

	@Override 
	public Boolean visitEquiv(@NotNull PropCalcParser.EquivContext ctx) { 
		Boolean leftValue = visit(ctx.s());
		Boolean rightValue = visit(ctx.s2());
		return leftValue == rightValue;
	}


	@Override 
	public Boolean visitOr(@NotNull PropCalcParser.OrContext ctx) { 
		Boolean leftValue = visit(ctx.s3());
		Boolean rightValue = visit(ctx.s4());
		return leftValue || rightValue;
	}
	
	@Override 
	public Boolean visitAnd(@NotNull PropCalcParser.AndContext ctx) { 
		Boolean leftValue = visit(ctx.s3());
		Boolean rightValue = visit(ctx.s4());
		return leftValue && rightValue;
	}

	@Override 
	public Boolean visitPNode(@NotNull PropCalcParser.PNodeContext ctx) {
		return pValue; 
	}

	@Override 
	public Boolean visitQNode(@NotNull PropCalcParser.QNodeContext ctx) { 
		return qValue; 
	}


}

package pl.edu.pjatk.mpr.propositionalcalculus.evaluator;

import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcBaseVisitor;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.AndContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.EquivContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.ImplContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.NegContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.OrContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.PNodeContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.ParensContext;
import pl.edu.pjatk.mpr.propositionalcalculus.parser.PropCalcParser.QNodeContext;

public class EvalVisitor extends PropCalcBaseVisitor<Boolean>{

	private boolean pValue;
	private boolean qValue;
	
	public EvalVisitor(boolean pValue, boolean qvalue) {
		this.pValue = pValue;
		this.qValue = qvalue;
	}

	@Override
	public Boolean visitNeg(NegContext ctx) {
		return !visit(ctx.s4());
	}

	@Override
	public Boolean visitImpl(ImplContext ctx) {
		Boolean leftValue = visit(ctx.s2());
		Boolean rightValue = visit(ctx.s3());
		if (leftValue && !rightValue) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Boolean visitParens(ParensContext ctx) {
		return visit(ctx.s());
	}

	@Override
	public Boolean visitEquiv(EquivContext ctx) {
		Boolean leftValue = visit(ctx.s());
		Boolean rightValue = visit(ctx.s2());
		return leftValue.equals(rightValue);
	}

	@Override
	public Boolean visitOr(OrContext ctx) {
		Boolean leftValue = visit(ctx.s3());
		Boolean rightValue = visit(ctx.s4());
		return leftValue || rightValue;
	}

	@Override
	public Boolean visitAnd(AndContext ctx) {
		Boolean leftValue = visit(ctx.s3());
		Boolean rightValue = visit(ctx.s4());
		return leftValue && rightValue;
	}

	@Override
	public Boolean visitPNode(PNodeContext ctx) {
		return pValue;
	}

	@Override
	public Boolean visitQNode(QNodeContext ctx) {
		return qValue;
	}
	
	

}

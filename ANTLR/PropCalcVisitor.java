// Generated from PropCalc.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PropCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PropCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link PropCalcParser#s4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(@NotNull PropCalcParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impl}
	 * labeled alternative in {@link PropCalcParser#s2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpl(@NotNull PropCalcParser.ImplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link PropCalcParser#s4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull PropCalcParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code s2Node}
	 * labeled alternative in {@link PropCalcParser#s2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS2Node(@NotNull PropCalcParser.S2NodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equiv}
	 * labeled alternative in {@link PropCalcParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquiv(@NotNull PropCalcParser.EquivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code s3Node}
	 * labeled alternative in {@link PropCalcParser#s3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS3Node(@NotNull PropCalcParser.S3NodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link PropCalcParser#s3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull PropCalcParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link PropCalcParser#s3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull PropCalcParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link PropCalcParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull PropCalcParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sNode}
	 * labeled alternative in {@link PropCalcParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSNode(@NotNull PropCalcParser.SNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pNode}
	 * labeled alternative in {@link PropCalcParser#s4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPNode(@NotNull PropCalcParser.PNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qNode}
	 * labeled alternative in {@link PropCalcParser#s4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQNode(@NotNull PropCalcParser.QNodeContext ctx);
}
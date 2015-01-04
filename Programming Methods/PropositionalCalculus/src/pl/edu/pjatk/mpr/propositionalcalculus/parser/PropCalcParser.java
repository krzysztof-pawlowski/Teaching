package pl.edu.pjatk.mpr.propositionalcalculus.parser;

// Generated from PropCalc.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PropCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		WS=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'or'", "'p'", "'q'", "'impl'", "'neg'", "'('", "')'", "'and'", 
		"'equiv'", "WS"
	};
	public static final int
		RULE_start = 0, RULE_s4 = 1, RULE_s3 = 2, RULE_s2 = 3, RULE_s = 4;
	public static final String[] ruleNames = {
		"start", "s4", "s3", "s2", "s"
	};

	@Override
	public String getGrammarFileName() { return "PropCalc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PropCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PropCalcParser.EOF, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PropCalcVisitor ) return ((PropCalcVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); s(0);
			setState(11); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S4Context extends ParserRuleContext {
		public S4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s4; }
	 
		public S4Context() { }
		public void copyFrom(S4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegContext extends S4Context {
		public S4Context s4() {
			return getRuleContext(S4Context.class,0);
		}
		public NegContext(S4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PropCalcVisitor ) return ((PropCalcVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends S4Context {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public ParensContext(S4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PropCalcVisitor ) return ((PropCalcVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PNodeContext extends S4Context {
		public PNodeContext(S4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PropCalcVisitor ) return ((PropCalcVisitor<? extends T>)visitor).visitPNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QNodeContext extends S4Context {
		public QNodeContext(S4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PropCalcVisitor ) return ((PropCalcVisitor<? extends T>)visitor).visitQNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S4Context s4() throws RecognitionException {
		S4Context _localctx = new S4Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_s4);
		try {
			setState(21);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new PNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13); match(T__7);
				}
				break;
			case T__6:
				_localctx = new QNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14); match(T__6);
				}
				break;
			case T__4:
				_localctx = new NegContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(15); match(T__4);
				setState(16); s4();
				}
				break;
			case T__3:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(17); match(T__3);
				setState(18); s(0);
				setState(19); match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S3Context extends ParserRuleContext {
		public S3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s3; }
	 
		public S3Context() { }
		public void copyFrom(S3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class S3NodeContext extends S3Context {
		public S4Context s4() {
			return getRuleContext(S4Context.class,0);
		}
		public S3NodeContext(S3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PropCalcVisitor ) return ((PropCalcVisitor<? extends T>)visitor).visitS3Node(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends S3Context {
		public S3Context s3() {
			return getRuleContext(S3Context.class,0);
		}
		public S4Context s4() {
			return getRuleContext(S4Context.class,0);
		}
		public OrContext(S3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PropCalcVisitor ) return ((PropCalcVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends S3Context {
		public S3Context s3() {
			return getRuleContext(S3Context.class,0);
		}
		public S4Context s4() {
			return getRuleContext(S4Context.class,0);
		}
		public AndContext(S3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PropCalcVisitor ) return ((PropCalcVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S3Context s3() throws RecognitionException {
		return s3(0);
	}

	private S3Context s3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		S3Context _localctx = new S3Context(_ctx, _parentState);
		S3Context _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_s3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new S3NodeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(24); s4();
			}
			_ctx.stop = _input.LT(-1);
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(32);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new OrContext(new S3Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_s3);
						setState(26);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(27); match(T__8);
						setState(28); s4();
						}
						break;
					case 2:
						{
						_localctx = new AndContext(new S3Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_s3);
						setState(29);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(30); match(T__1);
						setState(31); s4();
						}
						break;
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class S2Context extends ParserRuleContext {
		public S2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s2; }
	 
		public S2Context() { }
		public void copyFrom(S2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImplContext extends S2Context {
		public S3Context s3() {
			return getRuleContext(S3Context.class,0);
		}
		public S2Context s2() {
			return getRuleContext(S2Context.class,0);
		}
		public ImplContext(S2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PropCalcVisitor ) return ((PropCalcVisitor<? extends T>)visitor).visitImpl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class S2NodeContext extends S2Context {
		public S3Context s3() {
			return getRuleContext(S3Context.class,0);
		}
		public S2NodeContext(S2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PropCalcVisitor ) return ((PropCalcVisitor<? extends T>)visitor).visitS2Node(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S2Context s2() throws RecognitionException {
		return s2(0);
	}

	private S2Context s2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		S2Context _localctx = new S2Context(_ctx, _parentState);
		S2Context _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_s2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new S2NodeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(38); s3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImplContext(new S2Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_s2);
					setState(40);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(41); match(T__5);
					setState(42); s3(0);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SContext extends ParserRuleContext {
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	 
		public SContext() { }
		public void copyFrom(SContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EquivContext extends SContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public S2Context s2() {
			return getRuleContext(S2Context.class,0);
		}
		public EquivContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PropCalcVisitor ) return ((PropCalcVisitor<? extends T>)visitor).visitEquiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SNodeContext extends SContext {
		public S2Context s2() {
			return getRuleContext(S2Context.class,0);
		}
		public SNodeContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PropCalcVisitor ) return ((PropCalcVisitor<? extends T>)visitor).visitSNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		return s(0);
	}

	private SContext s(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SContext _localctx = new SContext(_ctx, _parentState);
		SContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_s, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SNodeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(49); s2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EquivContext(new SContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_s);
					setState(51);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(52); match(T__0);
					setState(53); s2(0);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return s3_sempred((S3Context)_localctx, predIndex);
		case 3: return s2_sempred((S2Context)_localctx, predIndex);
		case 4: return s_sempred((SContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean s3_sempred(S3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean s_sempred(SContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean s2_sempred(S2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f>\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\30\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4#\n\4\f\4\16\4&\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\6\2\5\6\b\n\7\2\4\6\b\n\2\2?\2\f\3\2"+
		"\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b\'\3\2\2\2\n\62\3\2\2\2\f\r\5\n\6\2\r"+
		"\16\7\2\2\3\16\3\3\2\2\2\17\30\7\4\2\2\20\30\7\5\2\2\21\22\7\7\2\2\22"+
		"\30\5\4\3\2\23\24\7\b\2\2\24\25\5\n\6\2\25\26\7\t\2\2\26\30\3\2\2\2\27"+
		"\17\3\2\2\2\27\20\3\2\2\2\27\21\3\2\2\2\27\23\3\2\2\2\30\5\3\2\2\2\31"+
		"\32\b\4\1\2\32\33\5\4\3\2\33$\3\2\2\2\34\35\f\4\2\2\35\36\7\3\2\2\36#"+
		"\5\4\3\2\37 \f\3\2\2 !\7\n\2\2!#\5\4\3\2\"\34\3\2\2\2\"\37\3\2\2\2#&\3"+
		"\2\2\2$\"\3\2\2\2$%\3\2\2\2%\7\3\2\2\2&$\3\2\2\2\'(\b\5\1\2()\5\6\4\2"+
		")/\3\2\2\2*+\f\3\2\2+,\7\6\2\2,.\5\6\4\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2"+
		"\2/\60\3\2\2\2\60\t\3\2\2\2\61/\3\2\2\2\62\63\b\6\1\2\63\64\5\b\5\2\64"+
		":\3\2\2\2\65\66\f\3\2\2\66\67\7\13\2\2\679\5\b\5\28\65\3\2\2\29<\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;\13\3\2\2\2<:\3\2\2\2\7\27\"$/:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
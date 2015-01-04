grammar PropCalc;


start: s EOF ;

s4: 'p'              # pNode 
  | 'q'              # qNode
  | 'neg' s4         # neg
  | '(' s ')'        # parens
  ;

s3: s4               # s3Node
  | s3 'or' s4       # or
  | s3 'and' s4      # and
  ;

s2: s3               # s2Node
  | s2 'impl' s3     # impl
  ;
s: s2                # sNode
  | s 'equiv' s2     # equiv 
  ;

WS : [ \t\r\n]+ -> skip ;
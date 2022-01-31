let size o = Obj.reachable_words(Obj.repr o);;
(*val size : 'a -> int = <fun>*)
let l1 = [2;4;6];;
size l1;; (*9*)
let l2 = 0::l1;;
size l2;; (*12*)
let dl = (l1,l2);;
size dl;; (*15*)
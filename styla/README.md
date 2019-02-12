# Styla

:one: Run the Styla REPL

```
$ sbt "runMain prolog.Main"
```

:two: The Prolog prompt should appear

```
Styla: Scala Terms Yield Logic Agents
Prolog System Version 1.3.4 with LogicActors
Copyright (C) Paul Tarau 2011-2014
?-
```


:three: Test by typing

```
?- member(3, [1,2,3]).
yes.
no (more) answers
```

:four: Consult a file

* create a file `list.pl` with some code

```
$ cat << EOF > list.pl
length(Xs,3).
EOF 
```

* Load the file

```
?- consult(list).
yes.
no (more) answers
```

* Run a query

```
?- append(Xs,[A,B],[1,2,3,4,5]).
Xs = [1,2,3]
A = 4
B = 5
;
no (more) answers
```

* Quit

```
?- halt.
```

Note: the REPL halt tarnishes your `tty`. To reset:

```
$ stty sane ^J
```


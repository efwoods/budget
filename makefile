JFLAGS = -g
JC=javac

Main.class: *.java
	$(JC) $(JFLAGS) *.java
	java Main

clean: 
	$(RM) *.class
JAVA_RUNEBLE ?= Fibonachi Evklid
PYTHON_RUNEBLE ?= Fibonachi Evklid Eratosfen
LUA_RUNEBLE ?= Evklid
C_LANG_RUNEBLE ?= Fibonachi Evklid Eratosfen
CPP_RUNEBLE ?= Eratosfen
GO_RUNEBLE ?= Evklid


run-java:
	for directory in $(JAVA_RUNEBLE); do \
	$(MAKE) -C $$directory $@ || exit $$?; done

run-python3:
	for directory in $(PYTHON_RUNEBLE); do \
	$(MAKE) -C $$directory $@ || exit $$?; done

run-lua:
	for directory in $(LUA_RUNEBLE); do \
	$(MAKE) -C $$directory $@ || exit $$?; done

run-gcc:
	for directory in $(C_LANG_RUNEBLE); do \
	$(MAKE) -C $$directory $@ || exit $$?; done

run-cpp:
	for directory in $(CPP_RUNEBLE); do \
	$(MAKE) -C $$directory $@ || exit $$?; done

run-golang:
	for directory in $(GO_RUNEBLE); do \
	$(MAKE) -C $$directory $@ || exit $$?; done

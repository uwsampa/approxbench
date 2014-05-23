JAVAC := javac
JAVA := java

RSRC := ../../rsrc
SCIMARK := $(RSRC)/scimark2
BUILD_DIR := build

SCIMARK_SRC := Constants.java Random.java kernel.java SOR.java
DRIVER_SRC := RunSOR.java

.PHONY: build run

build:
	make -C $(RSRC) scimark2
	mkdir -p $(BUILD_DIR)
	$(JAVAC) -d $(BUILD_DIR) $(SCIMARK_SRC:%=$(SCIMARK)/jnt/scimark2/%) \
		jnt/scimark2/$(DRIVER_SRC)

run:
	java -cp $(BUILD_DIR) jnt.scimark2.RunSOR

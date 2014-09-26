# Shared Makefile resources for the ApproxBench applications.
JAVAC := javac
JAVA := java

BUILD_DIR := built

RSRC := ../../rsrc

# Default target: compile.
.PHONY: all build run
all: build run

# Target to create the destination directory.
$(BUILD_DIR):
	mkdir -p $(BUILD_DIR)

.PHONY: clean
clean:
	rm -rf $(BUILD_DIR)

# SciMark2 sources.
SCIMARK := $(RSRC)/scimark2
SCIMARK_COMMON_NAMES := Constants.java Random.java kernel.java
SCIMARK_COMMON := $(SCIMARK_COMMON_NAMES:%=$(SCIMARK)/jnt/scimark2/%)
.PHONY: scimark2
scimark2:
	make -C $(RSRC) scimark2

# PARSEC 3.0 sources.
PARSEC := $(RSRC)/parsec-3.0
.PHONY: parsec
parsec:
	make -C $(RSRC) parsec-3.0

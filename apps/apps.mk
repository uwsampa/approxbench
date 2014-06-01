# Shared Makefile resources for the ApproxBench applications.
JAVAC := javac
JAVA := java

BUILD_DIR := built

RSRC := ../../rsrc

SCIMARK := $(RSRC)/scimark2
SCIMARK_COMMON_NAMES := Constants.java Random.java kernel.java
SCIMARK_COMMON := $(SCIMARK_COMMON_NAMES:%=$(SCIMARK)/jnt/scimark2/%)

# Default target: compile.
.PHONY: all build run
all: build run

# Target to create the destination directory.
$(BUILD_DIR):
	mkdir -p $(BUILD_DIR)

# Phony target to get the scimark2 sources.
.PHONY: scimark2
scimark2:
	make -C $(RSRC) scimark2

.PHONY: clean
clean:
	rm -rf $(BUILD_DIR)

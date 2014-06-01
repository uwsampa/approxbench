include ../apps.mk

SOURCES := $(SCIMARK)/jnt/scimark2/SparseCompRow.java jnt/scimark2/RunSMM.java \
	$(SCIMARK_COMMON)

build: $(BUILD_DIR) scimark2 $(SOURCES)
	$(JAVAC) -d $(BUILD_DIR) $(SOURCES)

run:
	java -cp $(BUILD_DIR) jnt.scimark2.RunSMM

include ../apps.mk

SOURCES := $(SCIMARK)/jnt/scimark2/LU.java jnt/scimark2/RunLU.java \
	$(SCIMARK_COMMON)

build: $(BUILD_DIR) scimark2 $(SOURCES)
	$(JAVAC) -d $(BUILD_DIR) $(SOURCES)

run:
	java -cp $(BUILD_DIR) jnt.scimark2.RunLU

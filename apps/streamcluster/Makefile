include ../apps.mk

CXXFLAGS += -DENABLE_THREADS -Wno-format -Wno-logical-op-parentheses
OBJECTS := $(BUILD_DIR)/streamcluster.o $(BUILD_DIR)/parsec_barrier.o

build: parsec $(BUILD_DIR) $(BUILD_DIR)/streamcluster

$(BUILD_DIR)/streamcluster: $(OBJECTS)
	$(CXX) $(CXXFLAGS) $(LDFLAGS) $^ -o $@

$(BUILD_DIR)/%.o: $(PARSEC)/pkgs/kernels/streamcluster/src/%.cpp
	$(CXX) $(CXXFLAGS) -c $^ -o $@

# simmedium input. No input file necessary.
run:
	$(BUILD_DIR)/streamcluster 10 20 64 8192 8192 1000 none \
		$(BUILD_DIR)/output.txt 4

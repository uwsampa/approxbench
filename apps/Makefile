APP_DIRS := fft lu mc sor

.PHONY: all build run clean

all build run clean:
	@for subdir in $(APP_DIRS) ; do \
		make -C $$subdir $@ ; \
	done

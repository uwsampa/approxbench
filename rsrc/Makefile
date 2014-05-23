FETCH := curl -O
UNZIP := unzip -o
UNTAR := tar -xmf

DIRS := scimark2 parsec-3.0
ARCHIVES := scimark2src.zip parsec-3.0-core.tar.gz

.PHONY: all clean

all: $(DIRS)

clean:
	rm -rf $(DIRS)
	rm -f $(ARCHIVES)

scimark2src.zip:
	$(FETCH) http://math.nist.gov/scimark2/scimark2src.zip

scimark2: scimark2src.zip scimark2.patch
	$(UNZIP) $< -d $@
	cd $@ ; patch -p1 < ../scimark2.patch

parsec-3.0-core.tar.gz:
	$(FETCH) http://parsec.cs.princeton.edu/download/3.0/parsec-3.0-core.tar.gz

parsec-3.0: parsec-3.0-core.tar.gz
	$(UNTAR) $<

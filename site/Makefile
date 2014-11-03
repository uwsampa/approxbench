.PHONY: setup site deploy clean_site

site: index.md
	jekyll build

clean:
	rm -rf _site

DESTHOST := bicycle.cs.washington.edu
DESTDIR := /cse/web/research/approxbench
RSYNCARGS := --compress --recursive --checksum --itemize-changes \
	--perms --chmod=ug+rw
deploy: clean site
	rsync $(RSYNCARGS) _site/ $(DESTHOST):$(DESTDIR)

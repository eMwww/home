clean:
	find . -name "*~" -exec ls -al {} \;
	find . -name "*~" -exec rm -rf {} \;


# in case you get the 'error: object file .git/objects/...' error
fixgit:
	find .git/objects/ -type f -empty | xargs rm
	git fetch -p
	git fsck --full

bundle:
	bundle exec jekyll build --trace
	bundle exec jekyll serve

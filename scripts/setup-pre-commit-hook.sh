#!/bin/sh

# Copy the pre-commit sample to the .git/hooks directory
cp hooks/pre-commit.sample .git/hooks/pre-commit

# Make the pre-commit hook executable
chmod +x .git/hooks/pre-commit


# Makefile for trees
# $Id$

CFLAGS=-O2
SRCS=tree.cpp
OBJS=tree.o
CC=c++

all:	tree

clean:
	-rm -rf *.o tree

linkedlist: $(OBJS)
	$(CC) $(CFLAGS) -o $@ $(OBJS)

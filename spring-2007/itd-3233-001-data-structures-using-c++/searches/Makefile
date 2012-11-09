# Makefile for searches
# $Id$

CFLAGS=-O2
SRCS=searchtest.cpp
OBJS=searchtest.o
HDRS=binarysearch.h searchtest.h
CC=c++

all:	searchtest

clean:
	-rm -rf *.o *.gch searchtest

headers: $(HDRS)

searchtest: headers $(OBJS)
	$(CC) $(CFLAGS) -o $@ $(OBJS)

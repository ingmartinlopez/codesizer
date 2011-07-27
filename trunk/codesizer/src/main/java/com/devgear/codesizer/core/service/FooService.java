package com.devgear.codesizer.core.service;

import java.util.List;

import com.devgear.codesizer.core.model.Foo;


public interface FooService {

	public void saveFoo(Foo foo);

	public Foo updateFoo(Foo foo);

	public List<Foo> findFoos();

}
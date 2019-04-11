package com.actifsource.simpleservice.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMyCall extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8bb2e89c-5bca-11e9-a8cd-29004858a597");
  
  // relations
  
  public java.util.List<? extends com.actifsource.simpleservice.generic.javamodel.IMyParameter> selectParameter();
  
  public com.actifsource.simpleservice.generic.javamodel.IMyType selectReturnType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8bb2e89c-5bca-11e9-a8cd-29004858a597,oWgxI9trmGrcjj2uDGt6zICLUN0=] */

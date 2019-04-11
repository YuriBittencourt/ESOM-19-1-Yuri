package com.actifsource.simpleservice.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMyService extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("88c11fba-5bca-11e9-a8cd-29004858a597");
  
  // relations
  
  public java.util.List<? extends com.actifsource.simpleservice.generic.javamodel.IMyCall> selectCall();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,88c11fba-5bca-11e9-a8cd-29004858a597,XW6OYi3/rHuuuchhkL1DWBn+Xxo=] */

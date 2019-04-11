package com.actifsource.simpleservice.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMyParameter extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9e7ec4b0-5bca-11e9-a8cd-29004858a597");
  
  // relations
  
  public java.util.List<? extends com.actifsource.simpleservice.generic.javamodel.IMyType> selectType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9e7ec4b0-5bca-11e9-a8cd-29004858a597,w3AIM/uyxetPwZzLo73winCy5Oc=] */

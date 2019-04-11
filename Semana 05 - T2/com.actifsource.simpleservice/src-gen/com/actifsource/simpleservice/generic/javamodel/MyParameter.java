package com.actifsource.simpleservice.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MyParameter extends DynamicResource implements IMyParameter {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMyParameter> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMyParameter>() {
    
    @Override
    public IMyParameter create() {
      return new MyParameter();
    }
    
    @Override
    public IMyParameter create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MyParameter(resourceRepository, resource);
    }
  
  };

  public MyParameter() {
    super(IMyParameter.TYPE_ID);
  }
  
  public MyParameter(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMyParameter.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends com.actifsource.simpleservice.generic.javamodel.IMyType> selectType() {
    return _getList(com.actifsource.simpleservice.generic.javamodel.IMyType.class, com.actifsource.simpleservice.generic.GenericPackage.myParameter_type);
  }

  public MyParameter setType(java.util.List<? extends com.actifsource.simpleservice.generic.javamodel.IMyType> type) {
    _setList(com.actifsource.simpleservice.generic.GenericPackage.myParameter_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MyParameter setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(com.actifsource.simpleservice.generic.javamodel.IMyType.class, com.actifsource.simpleservice.generic.GenericPackage.myParameter_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<com.actifsource.simpleservice.generic.javamodel.IMyParameter> selectToMeType(com.actifsource.simpleservice.generic.javamodel.IMyType object) {
    return _getToMeList(object.getRepository(), com.actifsource.simpleservice.generic.javamodel.IMyParameter.class, com.actifsource.simpleservice.generic.GenericPackage.myParameter_type, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9e7ec4b0-5bca-11e9-a8cd-29004858a597,/TufsKJ6exYJ6fglMMcrKAksBow=] */

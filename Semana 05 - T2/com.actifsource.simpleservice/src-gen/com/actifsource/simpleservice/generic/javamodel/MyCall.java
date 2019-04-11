package com.actifsource.simpleservice.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MyCall extends DynamicResource implements IMyCall {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMyCall> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMyCall>() {
    
    @Override
    public IMyCall create() {
      return new MyCall();
    }
    
    @Override
    public IMyCall create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MyCall(resourceRepository, resource);
    }
  
  };

  public MyCall() {
    super(IMyCall.TYPE_ID);
  }
  
  public MyCall(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMyCall.TYPE_ID);
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
  public java.util.List<? extends com.actifsource.simpleservice.generic.javamodel.IMyParameter> selectParameter() {
    return _getList(com.actifsource.simpleservice.generic.javamodel.IMyParameter.class, com.actifsource.simpleservice.generic.GenericPackage.myCall_parameter);
  }

  public MyCall setParameter(java.util.List<? extends com.actifsource.simpleservice.generic.javamodel.IMyParameter> parameter) {
    _setList(com.actifsource.simpleservice.generic.GenericPackage.myCall_parameter, parameter);
    return this;
  }
    
  @Override
  public com.actifsource.simpleservice.generic.javamodel.IMyType selectReturnType() {
    return _getSingle(com.actifsource.simpleservice.generic.javamodel.IMyType.class, com.actifsource.simpleservice.generic.GenericPackage.myCall_returnType);
  }

  public MyCall setReturnType(com.actifsource.simpleservice.generic.javamodel.IMyType returnType) {
    _setSingle(com.actifsource.simpleservice.generic.GenericPackage.myCall_returnType, returnType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MyCall setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(com.actifsource.simpleservice.generic.javamodel.IMyParameter.class, com.actifsource.simpleservice.generic.GenericPackage.myCall_parameter, visitor);
    _acceptSingle(com.actifsource.simpleservice.generic.javamodel.IMyType.class, com.actifsource.simpleservice.generic.GenericPackage.myCall_returnType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static com.actifsource.simpleservice.generic.javamodel.IMyCall selectToMeParameter(com.actifsource.simpleservice.generic.javamodel.IMyParameter object) {
    return _getToMeSingle(object.getRepository(), com.actifsource.simpleservice.generic.javamodel.IMyCall.class, com.actifsource.simpleservice.generic.GenericPackage.myCall_parameter, object.getResource());
  }
  
  public static java.util.List<com.actifsource.simpleservice.generic.javamodel.IMyCall> selectToMeReturnType(com.actifsource.simpleservice.generic.javamodel.IMyType object) {
    return _getToMeList(object.getRepository(), com.actifsource.simpleservice.generic.javamodel.IMyCall.class, com.actifsource.simpleservice.generic.GenericPackage.myCall_returnType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8bb2e89c-5bca-11e9-a8cd-29004858a597,I9fua/MhBwATApQ9HgWZdwlX4U4=] */

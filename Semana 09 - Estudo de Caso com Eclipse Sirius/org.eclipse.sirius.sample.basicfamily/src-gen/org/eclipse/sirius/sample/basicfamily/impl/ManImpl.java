/**
 */
package org.eclipse.sirius.sample.basicfamily.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.sirius.sample.basicfamily.BasicfamilyPackage;
import org.eclipse.sirius.sample.basicfamily.Man;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Man</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ManImpl extends PersonImpl implements Man {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicfamilyPackage.Literals.MAN;
	}

} //ManImpl

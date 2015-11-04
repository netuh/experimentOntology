/**
 */
package codingExperimentOntology.threats.impl;

import codingExperimentOntology.threats.GenericMitigable;
import codingExperimentOntology.threats.GenericMitigation;
import codingExperimentOntology.threats.NewPackage3Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Mitigable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.threats.impl.GenericMitigableImpl#getGeneralActions <em>General Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GenericMitigableImpl extends MinimalEObjectImpl.Container implements GenericMitigable {
	/**
	 * The cached value of the '{@link #getGeneralActions() <em>General Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralActions()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericMitigation> generalActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericMitigableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage3Package.Literals.GENERIC_MITIGABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericMitigation> getGeneralActions() {
		if (generalActions == null) {
			generalActions = new EObjectContainmentEList<GenericMitigation>(GenericMitigation.class, this, NewPackage3Package.GENERIC_MITIGABLE__GENERAL_ACTIONS);
		}
		return generalActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NewPackage3Package.GENERIC_MITIGABLE__GENERAL_ACTIONS:
				return ((InternalEList<?>)getGeneralActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewPackage3Package.GENERIC_MITIGABLE__GENERAL_ACTIONS:
				return getGeneralActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NewPackage3Package.GENERIC_MITIGABLE__GENERAL_ACTIONS:
				getGeneralActions().clear();
				getGeneralActions().addAll((Collection<? extends GenericMitigation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NewPackage3Package.GENERIC_MITIGABLE__GENERAL_ACTIONS:
				getGeneralActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NewPackage3Package.GENERIC_MITIGABLE__GENERAL_ACTIONS:
				return generalActions != null && !generalActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenericMitigableImpl

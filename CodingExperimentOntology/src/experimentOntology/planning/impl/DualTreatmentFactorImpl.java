/**
 */
package experimentOntology.planning.impl;

import experimentOntology.planning.DualTreatmentFactor;
import experimentOntology.planning.PlanningPackage;
import experimentOntology.planning.Treatment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dual Treatment Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.impl.DualTreatmentFactorImpl#getTreatments <em>Treatments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DualTreatmentFactorImpl extends FactorImpl implements DualTreatmentFactor {
	/**
	 * The cached value of the '{@link #getTreatments() <em>Treatments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatments()
	 * @generated
	 * @ordered
	 */
	protected EList<Treatment> treatments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DualTreatmentFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanningPackage.Literals.DUAL_TREATMENT_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Treatment> getTreatments() {
		if (treatments == null) {
			treatments = new EObjectContainmentEList<Treatment>(Treatment.class, this, PlanningPackage.DUAL_TREATMENT_FACTOR__TREATMENTS);
		}
		return treatments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanningPackage.DUAL_TREATMENT_FACTOR__TREATMENTS:
				return ((InternalEList<?>)getTreatments()).basicRemove(otherEnd, msgs);
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
			case PlanningPackage.DUAL_TREATMENT_FACTOR__TREATMENTS:
				return getTreatments();
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
			case PlanningPackage.DUAL_TREATMENT_FACTOR__TREATMENTS:
				getTreatments().clear();
				getTreatments().addAll((Collection<? extends Treatment>)newValue);
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
			case PlanningPackage.DUAL_TREATMENT_FACTOR__TREATMENTS:
				getTreatments().clear();
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
			case PlanningPackage.DUAL_TREATMENT_FACTOR__TREATMENTS:
				return treatments != null && !treatments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DualTreatmentFactorImpl

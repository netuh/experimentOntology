/**
 */
package experimentOntology.description.gqm.impl;

import experimentOntology.description.gqm.GqmPackage;
import experimentOntology.description.gqm.MetricGQM;

import experimentOntology.planning.DependentVariable;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric GQM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.gqm.impl.MetricGQMImpl#getRelatedVariable <em>Related Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricGQMImpl extends MinimalEObjectImpl.Container implements MetricGQM {
	/**
	 * The cached value of the '{@link #getRelatedVariable() <em>Related Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<DependentVariable> relatedVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricGQMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqmPackage.Literals.METRIC_GQM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependentVariable> getRelatedVariable() {
		if (relatedVariable == null) {
			relatedVariable = new EObjectResolvingEList<DependentVariable>(DependentVariable.class, this, GqmPackage.METRIC_GQM__RELATED_VARIABLE);
		}
		return relatedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqmPackage.METRIC_GQM__RELATED_VARIABLE:
				return getRelatedVariable();
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
			case GqmPackage.METRIC_GQM__RELATED_VARIABLE:
				getRelatedVariable().clear();
				getRelatedVariable().addAll((Collection<? extends DependentVariable>)newValue);
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
			case GqmPackage.METRIC_GQM__RELATED_VARIABLE:
				getRelatedVariable().clear();
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
			case GqmPackage.METRIC_GQM__RELATED_VARIABLE:
				return relatedVariable != null && !relatedVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetricGQMImpl

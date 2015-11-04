/**
 */
package experimentOntology.description.gqm.impl;

import experimentOntology.description.gqm.GqmPackage;
import experimentOntology.description.gqm.MetricGQM;
import experimentOntology.description.gqm.QuestionGQM;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question GQM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.gqm.impl.QuestionGQMImpl#getRelatedMetric <em>Related Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionGQMImpl extends MinimalEObjectImpl.Container implements QuestionGQM {
	/**
	 * The cached value of the '{@link #getRelatedMetric() <em>Related Metric</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedMetric()
	 * @generated
	 * @ordered
	 */
	protected EList<MetricGQM> relatedMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionGQMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqmPackage.Literals.QUESTION_GQM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetricGQM> getRelatedMetric() {
		if (relatedMetric == null) {
			relatedMetric = new EObjectResolvingEList<MetricGQM>(MetricGQM.class, this, GqmPackage.QUESTION_GQM__RELATED_METRIC);
		}
		return relatedMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqmPackage.QUESTION_GQM__RELATED_METRIC:
				return getRelatedMetric();
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
			case GqmPackage.QUESTION_GQM__RELATED_METRIC:
				getRelatedMetric().clear();
				getRelatedMetric().addAll((Collection<? extends MetricGQM>)newValue);
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
			case GqmPackage.QUESTION_GQM__RELATED_METRIC:
				getRelatedMetric().clear();
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
			case GqmPackage.QUESTION_GQM__RELATED_METRIC:
				return relatedMetric != null && !relatedMetric.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionGQMImpl
